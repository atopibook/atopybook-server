package com.atopybook.core.app.api.dtos.member;


import com.atopybook.core.app.domain.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MyProfileResponseData {

    private Long id;
    private String name;

    public MyProfileResponseData(Member member) {
        this.id = member.getId();
        this.name = member.getName();
    }
}
