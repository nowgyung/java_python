package ex0708;

public class EX04 {
	
	int num = 1; // static을 int앞에 붙이면 new언급해주지 않아도 
	
	public static void main(String[] args) {
		EX04 a = new EX04();
		System.out.println("num = "+a.num);
	}

}
