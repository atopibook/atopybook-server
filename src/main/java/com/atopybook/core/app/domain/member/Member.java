package com.atopybook.core.app.domain.member;

import com.atopybook.core.app.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED) //접근 레벨을 protected까지 지정하여 proxy 객체에 접근 할 수 있도록 한다.
public class Member extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.SEQUENCE) @Id
    private Long id;
    @Column
    private String name;

    @Builder
    public Member(String name) {
        this.name = name;
    }
}
