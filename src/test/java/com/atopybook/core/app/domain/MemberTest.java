package com.atopybook.core.app.domain;

import com.atopybook.core.app.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberTest {
    @Test
    void create() {
        Member member = Member.builder().name("jayden").build();
        assertThat(member.getName()).isEqualTo("jayden");
    }
}
