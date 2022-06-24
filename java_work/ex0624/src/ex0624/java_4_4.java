package ex0624;

//문제4
//변수 n1,n2,n3가 다음과 같을때 n1>n2>n3 이면 true, 아니면 false를 출력하는 프로그램을 작성해보자
//    n1 = {(25+5)+(36/4)-72}*5
//    n2 = {(25*5)+(36-4)+71}/4
//    n3 = (128/4)*2

public class java_4_4 {
	public static void main(String[] args) {
		
		/*
		int n1 =  ((25+5)+(36/4)-72)*5 ;
		int n2 =  ((25*5)+(36-4)+71)/4 ;
 		int n3 =  (128/4)*2 ;
 
 		
 		System.out.println(n1 > n2);
 		System.out.println(n2 > n3);
 		System.out.println(n1 < n3);
		*/
		
		int n1 =  ((25+5)+(36/4)-72)*5 ;
		int n2 =  ((25*5)+(36-4)+71)/4 ;
 		int n3 =  (128/4)*2 ;
 		
 		System.out.println(n1>n2 && n2>n3);
 		
		
 		
 		
		
	}

}
