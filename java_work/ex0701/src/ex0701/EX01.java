package ex0701;
/*
 * 1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고 그 수들의 합을 구해서 출력하는
 */
public class EX01 {
	
	public static void main(String[] args) {
		int num = 1;
		int sum= 0; 
		
		while(num <1001) {
			if((num % 2==0) && (num %7==0) ) {
			System.out.println("num ="+num);
			sum = sum + num;
			System.out.println("sum ="+sum); // 반복적힘을 막으려면 while문 밖으로 꺼내면 된다
			}
			num+=1; // num++;
			
		}
		
		
	}

}
