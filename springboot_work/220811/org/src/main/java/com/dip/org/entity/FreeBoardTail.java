package com.dip.org.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class FreeBoardTail {

    @ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "board_id")
    private FreeBoard freeboard;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String t_name;
    @Column(columnDefinition = "TEXT") //긴문자열이 들어갈 수 있도록
    private String t_content;

}
