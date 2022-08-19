package com.dip.org.controller;

import com.dip.org.entity.FreeBoard;
import com.dip.org.entity.FreeBoardTail;
import com.dip.org.repository.FreeBoardRepository;
import com.dip.org.repository.FreeBoardTailRepository;
import com.dip.org.req.FreeBoardReq;
import com.dip.org.req.FreeBoardTailReq;
import com.dip.org.service.FreeBoardService;
import lombok.Getter;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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


    @GetMapping("freeboard/delete")
    public String delete(long id){
        freeBoardRepository.deleteById(id);
        return "redirect:/freeboard";
    }

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

    @GetMapping("freeboard/view")
    public String view(long id, Model model, HttpServletRequest request){
        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard()); // 해당 id에 있는 데이터를 가져, 없으면 빈 객체생성해서 넣

        freeBoard.setHits(freeBoard.getHits()+1);//hits수 올리기
        freeBoardRepository.save(freeBoard); //자동으로 update 구문 생성

        model.addAttribute("freeboard", freeBoard);
        return "freeboard/view";
    }

    @PostMapping("freeboard/view")
    public String pview(long id, Model model, FreeBoardTailReq freeBoardTailReq){

        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard());
        freeBoardTailRepository.save(
                FreeBoardTail.builder()
                        .freeboard(freeBoard)
                        .t_content(freeBoardTailReq.getT_content())
                        .t_name(freeBoardTailReq.getT_name())
                        .build()
        );

         // 해당 id에 있는 데이터를 가져, 없으면 빈 객체생성해서 넣
        model.addAttribute("freeboard", freeBoard);

        return "redirect:/freeboard/view?id="+id;
    }

    @GetMapping("freeboard/write")
    public String write(FreeBoardReq freeBoardReq, @RequestParam(required = false) String id) {
        System.out.println(id);
//  id값이 null이면(새로운 글 쓰는 상황) insert id값이 숫자로 있으면(있는 글 수정하는 상황) update해야하는 상황

        try{
            if (id !=null && !id.equals("")){
                FreeBoard freeBoard
                        = freeBoardRepository.findById(Long.parseLong(id)).orElse(new FreeBoard());
                freeBoardReq.setTitle(freeBoard.getTitle());
                freeBoardReq.setContent(freeBoard.getContent());
            }
        }catch (Exception e){
            e. printStackTrace();

        }
        return "freeboard/write";
    }

    @PostMapping("freeboard/write")
    public String pwrite(@Valid FreeBoardReq freeBoardReq,
                         BindingResult bindingResult,
                         @RequestParam("file") MultipartFile file,
                         @RequestParam(required = false) String id) {

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
//        freeBoardReq.getId() 있으면 save() 함수 호출 시 update구문이 자동으로 실행
//        freeBoardReq.getId() 없으면 save() 함수 호출 시 insert구문이 자동으로 실행행
        if (id !=null && !id.equals("")) {
            freeBoardService.regist(
                    FreeBoard.builder()
                            .id(Long.parseLong(id))
                            .content(freeBoardReq.getContent())
                            .title(freeBoardReq.getTitle())
                            .regdate(LocalDateTime.now())
                            .filename(fileName)
                            .build()
            );
        }else {
            freeBoardService.regist(
                    FreeBoard.builder()
                            .content(freeBoardReq.getContent())
                            .title(freeBoardReq.getTitle())
                            .regdate(LocalDateTime.now())
                            .filename(fileName)
                            .build()
            );
        }

        return "redirect:/freeboard";
    }
}
