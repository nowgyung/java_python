package com.dip.org.controller;

import com.dip.org.entity.FreeBoard;
import com.dip.org.entity.FreeBoardTail;
import com.dip.org.repository.FreeBoardRepository;
import com.dip.org.repository.FreeBoardTailRepository;
import com.dip.org.req.FreeBoardReq;
import com.dip.org.req.FreeBoardTailReq;
import com.dip.org.service.FreeBoardService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class FreeBoardController {

    @Autowired
    private FreeBoardService freeBoardService;

    @Autowired
    private FreeBoardRepository freeBoardRepository;

    @Autowired
    private FreeBoardTailRepository freeBoardTailRepository;

    @GetMapping("freeboard")
    public String freeboard(Model model) {

//        freeBoardService.regist(
//                FreeBoard.builder()
//                        .id(1L) //long타입의 숫자 1
//                        .title("제목제목")
//                        .content("내용")
//                        .regdate(LocalDateTime.now())
//                        .build()
//        );
//        freeBoardService.regist(
//                FreeBoard.builder()
//                        .id(2L) //long타입의 숫자 1
//                        .title("123제목제목")
//                        .content("123내용")
//                        .regdate(LocalDateTime.now())
//                        .build()
//        ); // 페이지 첫화면을 위해서 인위적으로 적은것 사용자에게 폼으로 정보 얻은것 아님

        List<FreeBoard> list = freeBoardService.selectlist();

        model.addAttribute("list", list);
        System.out.println(list);


        return "freeboard/freeboard"; //freeboard 안에가면 freeboard폴더 안에있는 freeboard가 나오도록
    }

    @GetMapping("freeboard/write")
    public String write(FreeBoardReq freeBoardReq) {
        return "freeboard/write";
    }

    @GetMapping("freeboard/view")
    public String view(long id, Model model){
        System.out.println(id);
        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard()); // 해당 id에 있는 데이터를 가져, 없으면 빈 객체생성해서 넣
        System.out.println(freeBoard);
        model.addAttribute("freeboard", freeBoard);
        return "freeboard/view";
    }

    @PostMapping("freeboard/view")
    public String pview(long id, Model model, FreeBoardTailReq freeBoardTailReq){
        System.out.println(id);
        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard()); // 해당 id에 있는 데이터를 가져, 없으면 빈 객체생성해서 넣
        System.out.println(freeBoard);
        System.out.println(freeBoardTailReq);
        model.addAttribute("freeboard", freeBoard);

        freeBoardTailRepository.save(
                FreeBoardTail.builder()
                        .board_id(freeBoardTailReq.getId())
                        .t_content(freeBoardTailReq.getT_content())
                        .t_name(freeBoardTailReq.getT_name())
                        .build()
        );

        return "freeboard/view";
    }

    @PostMapping("freeboard/write")
    public String pwrite(@Valid FreeBoardReq freeBoardReq, BindingResult bindingResult,@RequestParam(value = "file",required = false) MultipartFile file) {

        if (bindingResult.hasErrors()) {
            return "freeboard/write";
        }

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        if( fileName !=null && !fileName.equals("")) {
            try {
                //D:\mhgit\springboot_work\20220811\org\src\main\resources\static\img
                //D:\mhgit\springboot_work\20220811\org\target\classes\static\img
                File file1 = new File("D:\\mhgit\\springboot_work\\220811\\org\\src\\main\\resources\\static\\img\\"+ fileName);
                File newfile = new File("D:\\mhgit\\springboot_work\\220811\\org\\src\\main\\resources\\static\\img\\" + fileName);

                file.transferTo(file1);

                Files.copy(file1.toPath(), newfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
                return "freeboard/write";
            }
        }

        freeBoardService.regist(
                FreeBoard.builder()
//                        .id(-1L)
                        .content(freeBoardReq.getContent())
                        .title(freeBoardReq.getTitle())
                        .regdate(LocalDateTime.now())
                        .filename(fileName)
                        .build()
        );

        return "redirect:/freeboard";
    }
}
