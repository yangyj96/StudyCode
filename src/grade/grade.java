package grade;

class Subject1 {
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int tot;
	float avg;
	int rank;
	char point;
	
	Subject1(){};
	Subject1(String name, int number, int kor, int eng, int math){
		this.name = name;
		this.number = number;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}
public class grade {
	public static void main(String[] args) {
		Subject1[] sub = new Subject1[4];
		sub[0] = new Subject1("kim",1,90,70,80);
		sub[1] = new Subject1("lee",2,100,90,90);
		sub[2] = new Subject1("park",3,40,50,70);
		sub[3] = new Subject1("choi",4,80,60,70);
		
		for(int i =0; i<sub.length; i++) {
			sub[i].tot = sub[i].kor + sub[i].eng + sub[i].math;
			sub[i].avg = sub[i].tot/3;
			sub[i].rank = 1;
			
			if(sub[i].avg>=90) {
				sub[i].point = 'A';
			}else if(sub[i].avg>=80) {
				sub[i].point = 'B';
			}else if(sub[i].avg>=70) {
				sub[i].point = 'C';
			}else if(sub[i].avg>=60) {
				sub[i].point = 'D';
			}else {
				sub[i].point = 'F';
			}
			sub[i].rank = 1;
		}
		for (int i=0; i<sub.length; i++) {
			for(int j=0; j<sub.length; j++) {
				if(sub[i].avg<sub[j].avg) {
					sub[i].rank++;
				}
			}
		}
		System.out.println("*******************************성적표*******************************");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("-------------------------------------------------------------------");
		for (int i=0; i< sub.length; i++) {
			System.out.println(sub[i].number+"\t"
						+sub[i].name+"\t"+sub[i].kor+"\t"+sub[i].eng+"\t"+sub[i].math+"\t"
						+sub[i].tot+"\t"+sub[i].avg+"\t"+sub[i].point+"\t"+sub[i].rank);
		}
	}

}
