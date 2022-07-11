package ex0711;

public class EX11_1 {
	public static void main(String[] args) {
		
		String str = "990925-1012999";
		String str1 = str.substring(0,6);
		String str2 = str.substring(7,14);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + " " + str2;
		
		System.out.println(str3);
	
	}
	
}
