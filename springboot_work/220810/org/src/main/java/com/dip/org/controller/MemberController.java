package com.dip.org.controller;

import com.dip.org.components.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    AA aa;
    //127.0.0.1:8000/member

    @GetMapping("member")
//    @ResponseBody
    public String member(){
        aa.doA();
        return "member";
    }

//    @GetMapping("membergetcall")


}
