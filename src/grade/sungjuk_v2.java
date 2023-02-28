package grade;

public class sungjuk_v2 {
	public static void main(String[] args) {
		int no = 1;
		int kor = 98;
		int eng = 90;
		int tot = kor+eng;
		int avg = tot/2;
		char point = 'A';
		int rank = 1;
		
		System.out.println("***********************성적표***********************");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------------------");
		System.out.println(no+"\t"+kor+"\t"+eng+"\t"+tot+"\t"+avg+"\t"+point+"\t"+rank);
		
	}
}
