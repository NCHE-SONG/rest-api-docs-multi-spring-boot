package io.nche.repository;

import io.nche.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DataJpaTest
public class MemberRepositoryTests {

    @Autowired private MemberRepository memberRepository;

    @Test
    public void add () {
        memberRepository.save(new Member("sec", "sec@gmail.com"));
        Member saved = memberRepository.findById(1L).orElse(null);
        assertThat(saved.getName(), is("sec"));
    }
}
