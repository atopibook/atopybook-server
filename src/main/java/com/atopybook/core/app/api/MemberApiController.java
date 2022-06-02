package com.atopybook.core.app.api;

import com.atopybook.core.app.api.dtos.member.CreateMemberRequest;
import com.atopybook.core.app.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberApiController {
    private final MemberService memberService;

    @PostMapping("join")
    public Long saveMember(
        CreateMemberRequest dto
    ) {
        Long newMemberId = memberService.join(dto.getName());

        return newMemberId;
    }
}
