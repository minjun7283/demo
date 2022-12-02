package hello2.demo.repository;
import hello2.demo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // optional은 NULL이 반환되는 경우를 대비함
    Optional<Member> findByName(String name);

    Optional<Member> findById(Long id);

    List<Member> findAll(); // 모든 정보를 반환

}
