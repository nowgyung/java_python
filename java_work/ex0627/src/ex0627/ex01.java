package ex0627;

public class ex01 {

	
	public static void main(String[] args) {
		
		//변수선언, 사용 용도에따라  int, double, String, boolean
		//num++ 대입 후 증가
		//++num 증가 후 대입
		
		int a  = 10;
		double b = a; // 자동
		
		double c = 30.44;
		int d =(int)c; // 수동으로 변환 작은공간에 넣을때 데이터의 소실되기에
		System.out.println("b = " + b);
		System.out.println("d = " + d);

		System.out.println("(3 + 4)*5 =" + (3 + 4) * 5);
		System.out.println("3 > 4 = " + (3 > 4));
		
		int num1 = 3;
		System.out.println("3 > 4 = " + (3 > 4 && (num1 += 3) < 3));
		System.out.println("num1 = " + num1);
		System.out.println("3 > 4 = " + (3 > 4 || (num1 += 3) < 3));
		System.out.println("num1 = " + num1);

	}
}
