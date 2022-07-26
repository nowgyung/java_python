package exME;

class Box{
	String text;
	int num;
	@Override
	public String toString() {
		return text;
	}
	public Box(String text, int num) {
		super();
		this.text = text;
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}

public class EnhancedForInst {
	public static void main(String[] args) {
		Box[] ar = new Box[5];
		
		ar[0] = new Box("coffee", 101);
		ar[1] = new Box("computer", 202);
		ar[2] = new Box("apple", 303);
		ar[3] = new Box("dress", 404);
		ar[4] = new Box("fairy-tale book", 505);
		
		
		for(Box e : ar) {
			if(e.getNum() == 505)
				System.out.println(e);
		}
	}

}
