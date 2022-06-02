package com.atopybook.core.app.repository;

import com.atopybook.core.app.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
