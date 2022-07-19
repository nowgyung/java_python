package exME;

class SinivelCap{
	void take() {
		System.out.println("콧물이 싹 납니다.");
	}
}
class SneezeCap{
	void take() {
		System.out.println("재채기가 멎습니다.");
	}
}
class SnuffleCap{
	void take() {
		System.out.println("코가 뻥 뚫립니다.");
	}
}
class ColdPatient1{
	void takeSinivelCap(SinivelCap cap) {
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
}

public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient1 suf = new ColdPatient1();
		
		suf.takeSinivelCap(new SinivelCap());
		
		suf.takeSneezeCap(new SneezeCap());
		
		suf.takeSnuffleCap(new SnuffleCap());
	}

}
