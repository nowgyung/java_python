package exME;
/*
 * 구구단 2,4,6,8단만 출력, 2단은 2*2 4단은 4*4 6단은 6*6까지 출력
 */
public class me02 {
	public static void main(String[] args) {
		for(int i=0 ;i<9;i+=2) {
			for(int j=1;j<i+1;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
