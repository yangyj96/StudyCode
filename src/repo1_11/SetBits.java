package repo1_11;

import java.util.Scanner;

class SetBits {
	static void printsBits(int x) {
		for(int i = 31; i>=0; i--)
			System.out.print(((x >>> i&1) == 1)? '1' : '0') ;
	}
	
	static int setN(int x, int pos, int n) {
		return x | (~(~0 <<n) << pos);
	}
	static int resetN(int x,int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}
	
	static int inverseN(int x, int pos, int n) {
		return x ^ (~(~0 << n) << pos);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수x의 pos번째 비트를 변경합니다.");
		System.out.print("x : "); int x = stdIn.nextInt();
		System.out.print("pos: "); int pos = stdIn.nextInt();
		System.out.print("n : "); int n = stdIn.nextInt();
		
		System.out.print("x                  ="); printsBits(x);
		System.out.print("\nsetN(x,pos, n)     ="); printsBits(setN(x, pos, n));
		System.out.print("\nresetN(x,pos, n)   ="); printsBits(resetN(x, pos, n));
		System.out.print("\ninverseN(x,pos, n) ="); printsBits(inverseN(x, pos, n));
		System.out.println();
	}
}
