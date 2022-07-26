package exME;


public class ME13_1 {
	public static void main(String[] args) {
		int [] arr = {7,2,6,1,3};
		int min =0;
		for(int i=0; i<arr.length; i++)
			if (arr[i+1]>1) {
				arr[i] = min;
				
			System.out.println(min);
			}
		
	}

}
