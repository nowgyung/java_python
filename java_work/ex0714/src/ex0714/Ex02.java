package ex0714;

/*
 * 문제2
 * 다음과 같이 존재하는 2차원배열이 존재할 때 이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면
 * 배열의 구조를 변경시키는 메소드를 정의해보자
 */
public class Ex02 {
	public static void printoneArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
	}

	public static void printtwoArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			printoneArr(arr[i]);
		System.out.println();
		}

    

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int b[] = a[0];
		int c[] = a[1];

		a[0] = a[2]; // 0번째에 있는 123이 사라짐, 다른곳 대입할것이 필요
		a[1] = b;
		a[2] = c;
		
		Ex01.printtwoArr(a);
		

	}
}
