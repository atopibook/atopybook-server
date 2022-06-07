package com.atopybook.core.app.service;

import com.atopybook.core.app.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    @Transactional
    @Rollback(false)
    public void join() {
        String memberName = "jayden";

        Long memberId = memberService.join(memberName);
        assertThat(memberId).isEqualTo(1L);
    }

    @Test
    @Rollback(false)
    public void myProfile() {
        String memberName = "jayden";
        Long memberId = memberService.join(memberName);
        Optional<Member> member = memberService.getMemberById(memberId);
        assertThat(member.get().getName()).isEqualTo(memberName);
    }
}