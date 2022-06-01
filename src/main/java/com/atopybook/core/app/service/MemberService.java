package com.atopybook.core.app.service;

import com.atopybook.core.app.domain.member.Member;
import com.atopybook.core.app.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long join(String name) {
        Member member = Member.builder().name(name).build();
        return memberRepository.save(member);
    }
}
