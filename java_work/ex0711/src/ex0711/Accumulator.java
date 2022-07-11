package ex0711;

public class Accumulator {
	private int sum=0;

	public void add(int i) {
		sum = sum += i;
	}

	public static void showResult() {
//		System.out.println("sum: "+sum);
	}

}
