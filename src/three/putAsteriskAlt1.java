package three;

import java.util.Scanner;

public class putAsteriskAlt1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요? : ");
		int n = stdIn.nextInt();
		if(n > 0) {
			int i = 0;
			while (i<n) {
				if(i%2 == 0)
					System.out.print('*'); //짝수이면 * 출력
				else
					System.out.print('+'); //홀수이면 + 출력
				i++;
			}
			System.out.println();
		}
	}
	

}
