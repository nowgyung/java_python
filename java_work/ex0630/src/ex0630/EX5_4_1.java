package ex0630;
/*
 * 1부터 99까지의 합을 구하는 프로그램을 작성하되 while물을 이용해서 작성해보자.
 */
public class EX5_4_1 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <100) {
			sum += num;
			num++;
		}
		System.out.println("sum = "+ sum);
	}
}


