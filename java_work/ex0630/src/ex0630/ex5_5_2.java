package ex0630;
/*
 * 구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성해보자.
 */
public class ex5_5_2 {

	public static void main(String[] args) {
		
		for(int i = 5;i<6;i++) {
			System.out.println("시작");
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			
		}
	}
}
