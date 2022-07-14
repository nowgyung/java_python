package ex0714;

/*
 * 309p
 * 문제1
 * 다음메소드는 int형 1차원 배열에 저장된 값을 두번째 매개변수로 전달된 값의 크기만크 전부 증가시킨다
 * 
 */
public class Ex01 {
	public static void printoneArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

	public static void printtwoArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			printoneArr(arr[i]);
			System.out.println();
		}

	}

	public static void addOneDArr(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++)
			arr[i] += add;
	}

	public static void addTwoDArr(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++)
			addOneDArr(arr[i], add);

//		addOneDArr(arr[0], add);
//		addOneDArr(arr[1], add);
//		addOneDArr(arr[2], add);
	}

	public static void main(String[] args) {
		/*
		 * int a[] = { 1, 2, 3, 4, 5 }; int add = 10;
		 * 
		 * addOneDArr(a, add); // 함수호출 printoneArr(a);
		 */
		int a[][] = { { 11 }, { 11, 22 }, { 11, 22, 33 }

		};
		printtwoArr(a);
		addTwoDArr(a, 3);
		printtwoArr(a);

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);

	}

}
