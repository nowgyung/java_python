package com.dip.org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public void newMember(MemberDto memberDto) {
	
//		memberDao.getSelectByEmail(memberDto.getEmail());
		
		memberDao.insert(memberDto);
		
	}
	public void printMember() {
		memberDao.selectall().forEach(m-> System.out.println(m));
	}	

}
