package org.example;

import java.time.LocalDateTime;

public class MemberRegisterService {

    private MemberDao memberDao = new MemberDao();

    public MemberRegisterService(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public void regist(RegisterRequest req) throws DuplicateMemberException {
        Member member = MemberDao.selectByEmail(req.getEmail());

        if(member != null){
            throw new DuplicateMemberException("dup email" + req.getEmail());
        }
        Member newMember = new Member(
                req.getEmail(),req.getPassword(),req.getName(), LocalDateTime.now());
        memberDao.insert(newMember);

    }

}
