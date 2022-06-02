package com.atopybook.core.app.api.dtos.member;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateMemberRequest {
    private String name;

    public CreateMemberRequest(String name) {
        this.name = name;
    }
}
