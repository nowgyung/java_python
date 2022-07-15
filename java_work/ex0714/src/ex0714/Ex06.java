package ex0714;

// Cake는 ACake 참조가능
// Cake는 BCake 참조가능
class Cake{
	
}
class ACake extends Cake{
	public void doA() {
		System.out.println("doA");

	}
}
class BCake extends Cake{
	public void doB() {
		System.out.println("doB");
	}
	
}

public class Ex06 {
	public static void main(String[] args) {
		Cake cake [] = new Cake[10]; // 자식 cake 10개 참조
		cake[0] = new ACake();
		cake[1] = new BCake();
		cake[2] = new ACake();
		
		if(cake[0] instanceof ACake) { // 변환이 가능한지 물어보는 예약어 true/false
			ACake ac = (ACake) cake[0];
			ac.doA();
		}
		
		if(cake[1] instanceof BCake) {
			BCake ab = (BCake) cake[1];
			ab.doB();
		}
		ACake ac3 = (ACake) cake[2];
		BCake ac4 = (BCake) cake[2];
		//ACake ac4 = (BCake) cake[2]; // 안에 ACake가 들어있기에 할수없다 뜬다, 예외상황 강제종료
		
	}
}
