package chap01;

import java.util.Scanner;


public class Max4 {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("네 개의 정수의 최대값을 구합니다.");
		System.out.println("a의 값 : "); int a = stdIn.nextInt();
		System.out.println("b의 값 : "); int b = stdIn.nextInt();
		System.out.println("c의 값 : "); int c = stdIn.nextInt();
		System.out.println("d의 값 : "); int d = stdIn.nextInt();
		
		
		System.out.println("최대값은 " + max4(a, b, c, d) + "입니다.");
	}
}
