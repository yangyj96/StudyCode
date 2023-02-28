package two;

import java.util.Scanner;

public class Med3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		System.out.print("정수 c:"); int c = stdIn.nextInt();
		
		int med;
		if(a>=b) //a>=b
			if(b>=c) // a>=b>=c
				med = b;
			else if(a<=c) //c>=a>=b
				med = a;
			else		//a>=c>=b
				med = c;
		else if(a>c) 	//b>=a>c
			med = a;
		else if(b>c)   //b>c>=a
			med = c;
		else			//a>b>c
			med = b;
		
		System.out.println("중앙값은 "+med+"입니다.");
		
	}

}
