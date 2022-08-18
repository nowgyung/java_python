package com.dip.org.req;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;


@Getter
@Setter
@ToString
public class FreeBoardTailReq {

    private long id; //freeboard값의 id값

    @NotEmpty
    private String t_name;

    @NotEmpty
    private String t_content;
}
