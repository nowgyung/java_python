package ex0704;

public class ex3_1 {
	public static void main(String[] args) {
		int result = doA(4);
		System.out.println("result = "+result);
		
		
	}
	public static int doA(int n) {
		
		if(n==0)
			return 1;
		
		else
			return 2*doA(n-1);
		
	}

}
