package com.example.dividend.persist;

import com.example.dividend.model.MemberEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByUsername(String username);     // ID 기준 회원정보 조회

    boolean existsByUsername(String username);                  // 회원가입시 이미 존재하는 ID 여부 확인

}
