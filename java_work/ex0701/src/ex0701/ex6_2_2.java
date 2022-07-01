-package ex0701;

public class ex6_2_2 {
	
	public static void main(String[] args) {
		prime(5); 
		
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
