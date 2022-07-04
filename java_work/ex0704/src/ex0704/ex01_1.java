package ex0704;

import java.util.Scanner;

public class ex01_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력");
		int num1 = scan.nextInt();
		System.out.println("num1: "+num1);
		
		System.out.println("두 번째 수 입력");
		int num2 = scan.nextInt();
		System.out.println("num2: "+num2);
		
		ABS(num1, num2);
		
		
		
	}
	public static void ABS(int num1, int num2) {
		if(num1>num2)
			System.out.println("절대값은: "+(num1-num2));
		else
			System.out.println("절대값은: "+(num2-num1));
		
		
	}
	
}
