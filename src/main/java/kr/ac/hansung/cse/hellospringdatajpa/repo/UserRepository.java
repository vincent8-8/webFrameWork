package kr.ac.hansung.cse.hellospringdatajpa.repo;

import kr.ac.hansung.cse.hellospringdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // 이메일로 사용자 찾기 (로그인 시 필요함)
    Optional<User> findByEmail(String email);
}