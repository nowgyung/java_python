package ex0715;

public class UniFriend extends Friend{
	private String major;
	public UniFriend(String name, String major, String phone) {
		super(name,phone); //extends Object가 생략되어 있기에 적힘
		this.major = major;
	}
	//@Override오버라이드 됨을 알림
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 = "+major);
	}
	
}
