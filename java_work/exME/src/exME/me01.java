package exME;
/*
 * 1부터 홀수를 더해 합이 몇 번 더했을때 1000을 넘어서는지 1000을 ㅓㄴㅁ긴값은 얼마가 되는지 출력
 */
public class me01 {

	public static void main(String[] args) {
		int num =1;
		int sum = 0;
		while(true) {
			sum += num;
			num += 2;
			System.out.println("num = "+num);
			if (sum> 1000)
				break;
		}
		System.out.println("sum = "+sum);
	}
}
