package hello2.demo.service;

import hello2.demo.domain.Member;
import hello2.demo.repository.MemberRepository;
import hello2.demo.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
//@Service
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    //@Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입

    public long join(Member member) {
            return member.getId();

    }

    private void validataDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).
                ifPresent(member1 ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }
    public List<Member> findMember(){
            return memberRepository.findAll();
    }
    public  Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
