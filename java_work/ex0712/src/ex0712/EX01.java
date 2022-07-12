package ex0712;
/*
 * 263p
 * 다음 주민등록번호의 중간에 있는 "-" 지우고 공백으로 채우는 프로그램을 작성해보자
 */
public class EX01 {
	public static void main(String[] args) {
		String jumin = "990925-1012999";
		String a[] = jumin.split("-"); // 기준으로 잘라라
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(a[0]+"-*******");
		
		
	}
}
