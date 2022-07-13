package ex0713;
/*
 *301p
 *int형 1차원 매개변수를 전달받아 배열에 전달된 최솟값, 최댓값을 반환하는 메소드를 정의 for / enhanced for 문 사용 
 */
public class Ex01 {
	public static int[] ary = {10,20,6,9,33,5}; //배열이 필요, 선언
	
	
	public static int minValue(int[]arr) {
		int min = ary[0];
		for(int i =0; i <ary.length;i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		return min;
	}
	public static int maxValue(int[]arr) {
		int max = ary[0];
		for(int temp:ary) {
			if(max < temp)
				max = temp;
		}
		return max;
	}
	public static void main(String[] args) {
		int min = minValue(ary);
		int max = maxValue(ary);
		
		System.out.println("최솟값 = " + min );
		System.out.println("최대값 = " + max );
		
		
	
	}

}
