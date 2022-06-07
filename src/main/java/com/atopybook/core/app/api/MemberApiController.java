package com.atopybook.core.app.api;

import com.atopybook.core.app.api.dtos.common.BaseResponse;
import com.atopybook.core.app.api.dtos.member.CreateMemberRequest;
import com.atopybook.core.app.api.dtos.member.MyProfileResponseData;
import com.atopybook.core.app.domain.member.Member;
import com.atopybook.core.app.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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

    @GetMapping("my-profile")
    public BaseResponse<MyProfileResponseData> myProfile() throws Exception {
        Long memberId = 1L;
        Optional<Member> member = memberService.getMemberById(memberId);
        if (member.isEmpty()) {
            throw new Exception();
        }
        return new BaseResponse<MyProfileResponseData>(200, "ok", new MyProfileResponseData(member.get()));
    }
}
