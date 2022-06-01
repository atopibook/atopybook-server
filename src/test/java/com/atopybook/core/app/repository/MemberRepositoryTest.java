package com.atopybook.core.app.repository;

import com.atopybook.core.app.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void saveTest() {
        Member member = Member.builder().name("jayden").build();
        Long memberId = memberRepository.save(member);
        assertThat(memberId).isEqualTo(1L);
    }

    @Test
    void findOneTest() {
        Member findMember = memberRepository.findOne(1L);
        assertThat(findMember.getName()).isEqualTo("jayden");
    }
}