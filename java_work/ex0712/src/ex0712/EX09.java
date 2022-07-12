package ex0712;

public class EX09 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		int num1 = minValue(arr);
		
//		int num2 = maxValue(arr);
		
	}
	public static int minValue(int[]arr) {
		int num1 = 0;
		for(int i = 0; i<arr.length; i ++)
			num1 += arr[i];
		
		return num1;
		
	}
//	public static int maxValue(int[]arr) {
//		int num2 = 0;
//		for(int i : arr)
//			if(i == 7)
//		return num2;
		
	}

}
