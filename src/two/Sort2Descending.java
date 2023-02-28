package two;

import java.util.Scanner;

public class Sort2Descending {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		
		if(a<b) {
			int t = a; //t안에 a가 들어감
			a = b;  //a에 b가 들어감
			b = t;  // b에 t가 들어감
		}
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 "+a+"입니다.");
		System.out.println("변수 b는 "+b+"입니다.");
	}

}
