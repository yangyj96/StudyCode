package grade;

public class sungjuk_v4 {
	public static void main(String[] args) {
		int no[] = {1,2,3};
		int kor[] = {98,76,86};
		int eng[] = {90,55,73};
		int tot[] = new int[3];
		int avg[] = new int[3];
		char point[] = new char[3];
		int rank[] = new int[3];
		
		for(int num=0; num<no.length; num++) {
			tot[num] = kor[num]+eng[num];
			avg[num] = tot[num]/2;
			if(avg[num]>=90) {
				point[num] = 'A';
			}else if(avg[num]>=80) {
				point[num] = 'B';
			}else if(avg[num]>=70) {
				point[num] = 'C';
			}else if(avg[num]>=60) {
				point[num] = 'D';
			}else {
				point[num] = 'F';
			}
			rank[num] = 1;
			
			
		}
		System.out.println("***********************성적표***********************");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------------------");
		for(int num=0; num<no.length; num++) {
			System.out.println(no[num]+"\t"+kor[num]+"\t"+eng[num]+"\t"+tot[num]+"\t"+avg[num]+"\t"+point[num]+"\t"+rank[num]);
		}
		
	}
}