package com.dip.mycompany.member;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Autowired
	SqlSessionTemplate SessionTemplate;

	
	@GetMapping("/member")
	@ResponseBody 
	public String member() {
		return "member";
	}
	
	@GetMapping("memberselect")
	@ResponseBody
	public String memberselect() {
		List<MemberDto> list 
		= SessionTemplate.selectList("member.select");
		return list.toString();
	}
	
	@GetMapping("memberupdate")
	@ResponseBody
	public String memberupdate() {
		return SessionTemplate.update("member.update") + "";
		
	}
	
	@GetMapping("memberinsert")
	@ResponseBody
	public String memberinsert() {
		return SessionTemplate.insert("member.insert") + "";
	}
	
	@GetMapping("memberdelete")
	@ResponseBody
	public String memberdelete() {
		return SessionTemplate.delete("member.delete") + "";
	}
}
