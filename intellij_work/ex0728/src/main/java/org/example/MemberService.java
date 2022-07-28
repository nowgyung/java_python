package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberService {//2.

    @Autowired //세터, 생성자 언급 할 필요없이 이것 적어주면 오토와이어드에 의한 디아이방식
    @Qualifier("memberdao1")
    private MemberDao memberDao;

    //저장
    public void regist(){
        memberDao.insert();
    }
    //보기
    public void getall(){
        memberDao.selectAll();
    }
    //삭제
    //변경



}
