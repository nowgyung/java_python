package ex0630;

public class SwitchBreak {
	public static void main(String[] args) {
		int n=3;
	/*	
		switch (n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The best programming Language");
			break;
		}
		System.out.println("Do you like Java?");
		*/
		if(n==1) {
			System.out.println("Simple Java");
		}
		else if (n==2) {
			System.out.println("Funny Java");
		}
		else if (n==3) {
			System.out.println("Fantastic Java");
		}
		else {
			System.out.println("The best programming Language");
		}
		System.out.println("Do you like Java?");
		
	}

}
