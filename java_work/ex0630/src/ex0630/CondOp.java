package ex0630;

/*
 * 두개의 수를 선언하고
 * 두수중에 큰수를 삼항연산자 출력
 * 두수의 차를 절대값
 */
public class CondOp {
	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 100;
		int result = 0; 

//		num1 = 200;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		
		if(num1 > num2)
			result = num1;
		else
			result = num2;
		System.out.println("result ="+result);
		
		if(num1 > num2)
			result = num1-num2;
		else
			result = num2-num1;
		System.out.println("result ="+result);
		
		
//		int result = num1 > num2 ? num1 : num2;
//		System.out.println("result = " + result);
//		
//		result = num1 > num2 ? num1-num2 : num2-num1; // 이미 선언, 값을 바꾸는것
//		System.out.println("result = " + result);

		
		

	}

}
