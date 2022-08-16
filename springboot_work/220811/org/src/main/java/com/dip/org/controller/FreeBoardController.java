package com.dip.org.controller;

import com.dip.org.entity.FreeBoard;
import com.dip.org.req.FreeBoardReq;
import com.dip.org.service.FreeBoardService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class FreeBoardController {

    @Autowired
    private FreeBoardService freeBoardService;

    @GetMapping("freeboard")
    public String freeboard(Model model) {

        freeBoardService.regist(
                FreeBoard.builder()
                        .id(1L) //long타입의 숫자 1
                        .title("제목제목")
                        .content("내용")
                        .regdate(LocalDateTime.now().toString())
                        .build()
        );
        freeBoardService.regist(
                FreeBoard.builder()
                        .id(2L) //long타입의 숫자 1
                        .title("123제목제목")
                        .content("123내용")
                        .regdate(LocalDateTime.now().toString())
                        .build()
        ); // 페이지 첫화면을 위해서 인위적으로 적은것 사용자에게 폼으로 정보 얻은것 아님

        List<FreeBoard> list = freeBoardService.selectlist();

        model.addAttribute("list", list);
        System.out.println(list);


        return "freeboard/freeboard"; //freeboard 안에가면 freeboard폴더 안에있는 freeboard가 나오도록
    }

    @GetMapping("freeboard/write")
    public String write() {
        return "freeboard/write";
    }

    @PostMapping("freeboard/write")
    public String pwrite(@Valid FreeBoardReq freeBoardReq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "freeboard/write";
        }
        freeBoardService.regist(
                FreeBoard.builder()
                        .id(-1L)
                        .content(freeBoardReq.getContent())
                        .title(freeBoardReq.getTitle())
                        .regdate(LocalDateTime.now().toString())
                        .build()
        );

        return "redirect:/freeboard"; // 셀렉트페이지로 가도록
    }

}
