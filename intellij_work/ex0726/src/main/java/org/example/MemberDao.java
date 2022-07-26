package org.example;

import java.util.HashMap;
import java.util.function.Consumer;

//멤버테이블에 접근할수 있는 접근 객체
public class MemberDao {

    public static HashMap<String,MemberDto> data = new HashMap<>(); //담을수 있는 맵, 딕셔너리가 생기는것


    public void selectAll() {
//        System.out.println(data);
        System.out.println("[data 출력 start]");
        if(data.size() ==0) System.out.println("data 내용없음");
        data.values().forEach(memberDto-> System.out.println(memberDto)); // values 하면 dto가 하나씩 들어가
        System.out.println();
    }
    public void insert(MemberDto dto) {
        data.put(dto.getEmail(),dto);
    }
}
