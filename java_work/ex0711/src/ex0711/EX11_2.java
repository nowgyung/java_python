package ex0711;

public class EX11_2 {
	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("990925-1012999");
		
		stbuf.replace(7, 1, " ");
		System.out.println(stbuf.toString());
	}

}
