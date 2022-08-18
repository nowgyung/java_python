package com.dip.org.entity;


//table 정의

import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FreeBoard {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")

    private String content;

    private String filename;
    private int hits;

    private LocalDateTime regdate;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "board_id")
    private List<FreeBoardTail> list;

}
