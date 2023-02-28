package grade;

public class sungjuk_v5 {
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
		for(int row=0; row<no.length-1; row++) {
			for(int col=row+1; col<no.length; col++) {
				if(avg[row] < avg[col]) {
					int temp = no[row];
					no[row] = no[col];
					no[col] = temp;
					
					temp = kor[row];
					kor[row] = kor[col];
					kor[col] = temp;
					
					temp = eng[row];
					eng[row] = eng[col];
					eng[col] = temp;
					
					temp = tot[row];
					tot[row] = tot[col];
					tot[col] = temp;
					
					temp = avg[row];
					avg[row] = avg[col];
					avg[col] = temp;
					
					char temp2 = point[row];
					point[row] = point[col];
					point[col] = temp2;
				}
			}
		}
		for(int row=0; row<no.length-1; row++) {
			for(int col=row+1; col<no.length; col++) {
				if(avg[row] < avg[col]) {
					rank[row]=rank[row]+1;
				}else if(avg[row] > avg[col]){
					rank[col]=rank[col]+1;
				}
			}
		}
		System.out.println("***********************성적표***********************");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("---------------------------------------------------");
		for(int num=0; num<no.length; num++) {
			System.out.println(no[num]+"\t"+kor[num]+"\t"+eng[num]+"\t"+tot[num]+"\t"+avg[num]+"\t"+point[num]+"\t"+rank[num]);
		}
	}

}
