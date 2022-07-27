package org.example;

import java.util.HashMap;
import java.util.function.Consumer;

//멤버테이블에 접근할수 있는 접근 객체
public class MemberDao {

    public static HashMap<String,MemberDto> data = new HashMap<>(); //담을수 있는 맵, 딕셔너리가 생기는것
// key 와 value가 쌍으로 보따리, 키를 주면 밸루가 나오도록

    public void selectAll() {
//        System.out.println(this);
//        System.out.println(data);
        System.out.println("[data 출력 start]");
        if(data.size() ==0) System.out.println("data 내용없음");
        data.values().forEach(memberDto-> System.out.println(memberDto)); // values 하면 dto가 하나씩 들어가
        System.out.println();
    }
    public void insert(MemberDto dto) {
//        System.out.println(this);
        // 어떤 값을 입력하더라도 본인의 주소값이 같이 출력, 어떤 함수를 사용해도 memberdao는 한개
        data.put(dto.getEmail(),dto);
    }

    public String getSelectByEmail(String email) {
//        System.out.println(this);
        MemberDto dto = data.get(email); //이메일 값을 던지면  아래 값을 던짐
        if(dto != null)
            return "have";
        else
            return "donthave";

    }
}
