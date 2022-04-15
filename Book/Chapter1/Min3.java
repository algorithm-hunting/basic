package chap01;

import java.util.Scanner;

public class Min3 {
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 개의 정수의 최소값을 구합니다.");
		System.out.println("a의 값 : "); int a = stdIn.nextInt();
		System.out.println("b의 값 : "); int b = stdIn.nextInt();
		System.out.println("c의 값 : "); int c = stdIn.nextInt();
		
		
		System.out.println("최소값은 " + min3(a, b, c) + "입니다.");
	}
}
