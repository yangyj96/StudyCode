package grade;

public class sungjuk5 {
	public static void main(String[] args) {
		String name[] = {"홍길동","임꺽정","신돌석"};
		int subject[][] = {{1,98,90,0,0,0}
						  ,{2,76,55,0,0,0}
						  ,{3,85,73,0,0,0}};
		char point[] =new char[3];
		
		for(int i = 0; i< subject.length; i++) {
			subject[i][3] = subject[i][1]+subject[i][2];
			subject[i][4] = subject[i][3]/2;
			
			if(subject[i][4]>=90) {
				point[i] = 'A';
			}else if(subject[i][4]>=80) {
				point[i] = 'B';
			}else if(subject[i][4]>=70) {
				point[i] = 'C';
			}else if(subject[i][4]>=60) {
				point[i] = 'D';
			}
			else {
				point[i] = 'F';
			}
			subject[i][5] =1;
		}
		System.out.println("***************************성적표***************************");
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i=0; i<subject.length; i++) {
			System.out.println(name[i]+"\t"+subject[i][0]+"\t"+subject[i][1]+"\t"+subject[i][2]+"\t"+subject[i][3]+"\t"+subject[i][4]+"\t"+point[i]+"\t"+subject[i][5]);
		}
		for(int row=0; row<subject.length-1; row++) {
			for (int col = row+1; col < subject.length; col++) {
				if (subject[row][4]<subject[col][4]) {
				int[] temp = subject[row];
				subject[row] = subject[col];
				subject[col] = temp; //swap
				
				String temp1 = name[row];
				name[row] = name[col];
				name[col] = temp1;
				
				char temp2 = point[row];
				point[row] = point[col];
				point[col] = temp2;
				}
				if (subject[row][4]<subject[col][4]) {
					subject[row][5] = subject[row][5]+1;
					
				}else if(subject[row][4]>subject[col][4]) {
					subject[col][5] = subject[col][5]+1;
				}
			}
			
		}
		System.out.println("***************************성적표***************************");
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i=0; i<subject.length; i++) {
			System.out.println(name[i]+"\t"+subject[i][0]+"\t"
					+subject[i][1]+"\t"+subject[i][2]+"\t"+subject[i][3]+"\t"
					+subject[i][4]+"\t"+point[i]+"\t"+subject[i][5]);
		}
		
	}
}
