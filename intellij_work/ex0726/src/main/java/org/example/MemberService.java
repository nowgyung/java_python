package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    @Autowired
    private MemberDao memberDao;//이것이 프로퍼티
    @Autowired
    private MemberPrinter memberPrinter; // 세터 생성, 클래스만들(3가지생성),


//    public void setMemberPrinter(MemberPrinter memberPrinter) {
//        this.memberPrinter = memberPrinter;
//    }
//    public MemberService(){};
//    public MemberService(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }
////생성자에 의한
//    public void setMemberDao(MemberDao memberDao) { this.memberDao = memberDao;
//        //세터방식에 의한
//    }
    public void list() {
        memberDao.selectAll(); //selectAll호출
    }
   /*
   만약 datamap 안에 같은 이메일이 있으면 저장 할 수 없다. 라는 메세지를 띄워
   아니면 저장을 해야합니다. 라는 메세지를 띄워
    */
    public void regist(MemberDto dto) throws Exception {
//        System.out.println(dto);
        String result = memberDao.getSelectByEmail(dto.getEmail());
        if(result.equals("have"))
            throw new Exception();
        else
            memberDao.insert(dto);

    }
    public void change(MemberDto dto) throws Exception {
        String result = memberDao.getSelectByPwd(dto.getPwd());
        if(result.equals("oldpwd"))
            throw  new Exception();
        else memberDao.newpwd(dto);
    }


}
