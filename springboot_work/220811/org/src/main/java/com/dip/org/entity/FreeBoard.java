package com.dip.org.entity;


//table 정의

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeBoard {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String title;
    private String content;

    private String filename;
    private int hits;

    private String regdate;

}
