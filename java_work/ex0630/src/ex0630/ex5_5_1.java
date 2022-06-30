package ex0630;
/*
 * 1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성해보자
 */
public class ex5_5_1 {
	public static void main(String[] args) {
		
		int sum = 1;
		for(int i =1; i<11; i++) {
			sum = sum * i;
		}
		System.out.println("sum ="+sum);
	}

}
