package com.dip.org.req;

//유효성검사
// 사용자가 form 저장버튼을 눌렀을때 글의 내용, 제목없을시 다시 입력받도록 유도하는 기능

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
public class FreeBoardReq {

    private Long id;

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    private String filename; // 파일 업로드
    private int hits; //

    private LocalDateTime regdate;

}
