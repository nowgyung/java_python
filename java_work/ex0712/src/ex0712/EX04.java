package ex0712;

public class EX04 {
	public static void main(String[] args) {
		AA[] ar = new AA[5]; // 크기만 만들어놓은것
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		System.out.println(ar.length);
		
		ar[0] = new AA("홍길동"); // 안에 값 넣기
		System.out.println(ar[0].toString());
		
		
	}
}
