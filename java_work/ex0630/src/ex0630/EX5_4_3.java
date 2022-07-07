package ex0630;
/*
 * 1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 
 * 그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해서 작성해보자.
 */
public class EX5_4_3 {

	public static void main(String[] args) {
		
		int num=1;
		boolean search = false;
		
		while(num<=1000) {
			if((num%2==0)&&(num%7==0)) {
				search  = true;
				break;
			}
			num++;
		}
		System.out.println("num = "+num);
		
	}
}
