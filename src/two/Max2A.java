package two;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수 a: "); double a = stdIn.nextDouble();
		System.out.print("실수 b: "); double b = stdIn.nextDouble();
		
		double max; //큰 값을 저장
		if(a > b)
			max = a;
		else
			max = b;
		
		System.out.println("큰 쪽의 값은 " + max + "입니다.");

	}

}
