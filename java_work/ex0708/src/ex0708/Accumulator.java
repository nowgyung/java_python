package ex0708;

public class Accumulator{
	static int sum = 0;
	static void add(int i) {
		sum += i;
	}
	static void showResult() {
		System.out.println("sum: "+ sum);
	}
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
}
