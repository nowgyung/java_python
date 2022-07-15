package ex0715;

public class Ex01 {
	public static void main(String[] args) {
		
		Friend[] uary = new Friend[10]; // 한명의 친구가 아닌 여러명의 사람들 등록할 때 list형태
		
		uary[0] = new UniFriend("홍길동", "컴공", "010-111-1111");
		uary[1] = new UniFriend("박길동", "전자", "010-555-5555");
		
		uary[2] = new CompFriend("이길동", "구매팀", "010-222-2222");
		uary[3] = new CompFriend("김길동", "기획팀", "010-333-3333");
		
		for(int i =0; i <4 ; i++) {
			uary[i].showInfo();
		}
	}

}
