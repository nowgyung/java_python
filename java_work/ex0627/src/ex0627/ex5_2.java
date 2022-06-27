package ex0627;

public class ex5_2 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 100;
		/*
		 * int big; int diff; big = (num1 > num2) ? num1 : num2;
		 * System.out.println("큰 수: "+ big);
		 * 
		 * diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		 * System.out.println("절대값: "+ diff) ;
		 */

		if (num1 > num2)
			System.out.println("큰 수:" + num1);
		else
			System.out.println("큰 수:" + num2);

		if (num1 > num2)
			System.out.println("절대값:" + (num1 - num2));
		else
			System.out.println("절대값:" + (num2 - num1));
	}
}
