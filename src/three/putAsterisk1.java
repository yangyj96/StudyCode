package three;

import java.util.Scanner;

public class putAsterisk1 {
	public static void main(String[] args) {
		Scanner stdIn = new  Scanner(System.in);
		System.out.print("몇 개의 *을 표시 할까요? : ");
		int n = stdIn.nextInt();
		if(n>0) {
			int i =0;
			while(i<n) {
				System.out.print("*");
				i++;
			}
			System.out.println();
		}
		
	}

}
