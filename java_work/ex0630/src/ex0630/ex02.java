package ex0630;

public class ex02 {

	public static void main(String[] args) {
		
		for(int i=0; i<10;i ++) {
			if(i==5) // == 비교
				break;
			
			if(i==1)
				continue;// 다음으로 계속
			System.out.println("i = "+i);
			
		}
		
	}
}
