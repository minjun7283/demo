package hello2.demo;

import hello2.demo.aop.TimeTraceAop;
import hello2.demo.repository.JpaMemberRepository;
import hello2.demo.repository.MemberRepository;
import hello2.demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    /*private DataSource dataSource;
    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

   /* private EntityManager em;
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService MemberService(){
        return new MemberService(memberRepository);
    }



    /*@Bean
    public MemberRepository MemberRepository(){
        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }*/


}
