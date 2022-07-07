package ex0704;

import java.util.Scanner;

/*
 * 142p
 * 정수 둘을 인자로 전달받아서, 두수의 차의절대값을 계산하여 출력하는 메소드와 이 메소드를 호출하는 메인 메소드 정의
 * 단 메소드 호출시 전달되는 값의 순서에 상관없이 절대 값이 걔산된다고 출력하여야 한다
 */
public class EX01 {
	
	public static void ABS(int fi, int se) {
		if(fi > se) {
			System.out.println("절대값은 = "+(fi-se));
		}else {
			System.out.println("절대값은 = "+(se-fi));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //system in 은 콘솔창에서 입력을 받음
		
		System.out.println("첫 번째 수 입력");
		int fi = scan.nextInt(); //사용자의 입력을 기다린다 
		System.out.println("fi = "+fi);
		
		System.out.println("두 번째 수 입력");
		int se = scan.nextInt(); //사용자의 입력을 기다린다 
		System.out.println("se = "+se);
		
		ABS(fi,se);
		
		
		
		
	}

}
