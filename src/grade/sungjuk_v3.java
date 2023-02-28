package grade;

public class sungjuk_v3 {
	public static void main(String[] args) {
		int no = 1;
		int kor = 98;
		int eng = 90;
		int tot = 0;
		int avg = 0;
		char point = ' ';
		int rank = 1;
		
		tot = kor+eng;
		avg = tot/2;
		
		if(avg>=90) {
			point='A';
		}else if(avg>=80) {
			point='B';
		}else if(avg>=70) {
			point='C';
		}else if(avg>=60) {
			point='D';
		}else {
			point='F';
		}
		
		System.out.println("***********************성적표***********************");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------------------");
		System.out.println(no+"\t"+kor+"\t"+eng+"\t"+tot+"\t"+avg+"\t"+point+"\t"+rank);
		
	}
}
