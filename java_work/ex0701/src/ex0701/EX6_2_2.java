package ex0701;

public class EX6_2_2 {
	
	public static void main(String[] args) {
		prime(); 
		
	}
	
	public static void prime(int num) {
		if ((num%num==0) && (num%1==num)) {
			System.out.println(true);		
		}
		else {
			System.out.println(false);
		}
	}

}
