package ex0707;

import ZOO.AAA;
//ctrl + shift + o
public class ZZZ extends AAA {
//import 대신, public class ZZZ extends ZOO.AAA 도 가능
	
	ZZZ(){
		num = 20;
	}
	public static void main(String[] args) {
		new ZZZ();
	}

}
