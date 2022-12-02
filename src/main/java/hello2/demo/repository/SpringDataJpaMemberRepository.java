package hello2.demo.repository;

import hello2.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>,MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
