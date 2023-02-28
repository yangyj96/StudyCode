package repo1_10;

import java.util.Scanner;

public class ShiftValue {
	static int pow2(int no) {
		int pw = 1;
		while (no-- > 0)
			pw *=2;
		return pw;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 x를 n비트 시프트 합니다.");
		System.out.print("x : "); int x= stdIn.nextInt();
		System.out.print("n : "); int n= stdIn.nextInt();
		
		int mPower = x *pow2(n);
		int dPower = x /pow2(n);
		int lshift = x << n;
		int rshift = x >> n;
		
		System.out.printf("[a] x x (2의 %d승) = %d\n",n, mPower);
		System.out.printf("[b] x / (2의 %d승) = %d\n",n, dPower);
		System.out.printf("[c] x << %d = %d\n",n, lshift);
		System.out.printf("[d] x >> %d = %d\n",n, rshift);
		
		System.out.println("[a]와 [c]의 값이 일치" +
		((mPower == lshift) ? "합니다." : "하지않습니다.") );
		System.out.println("[b]와 [d]의 값이 일치" +
				((dPower == rshift) ? "합니다." : "하지않습니다.") );
	}
}
