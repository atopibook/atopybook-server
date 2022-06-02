package com.atopybook.core.app.repository;

import com.atopybook.core.app.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void saveTest() {
        Member member = Member.builder().name("jayden").build();
        Member savedMember = memberRepository.save(member);
        assertThat(savedMember.getId()).isEqualTo(member.getId());
    }

    @Test
    void findOneTest() {
        Member member = Member.builder().name("jayden").build();
        Member savedMember = memberRepository.save(member);
        Member findMember = memberRepository.findById(savedMember.getId()).get();

        assertThat(findMember.getName()).isEqualTo("jayden");
    }
}