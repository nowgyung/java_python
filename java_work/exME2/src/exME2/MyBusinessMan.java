package exME2;

class Man {
	String name;

	public void tellYourname() {
		System.out.println("My name is: " + name);
	}
}

class BusinessMan extends Man {

	String company;
	String position;

	public BusinessMan(String name, String company, String position) {

		this.name = name;

		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is: " + company);
		System.out.println("My position is: " + position);
		tellYourname();

	}
}

public class MyBusinessMan extends Man {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff eng.");
		man.tellYourInfo();

	}

}
