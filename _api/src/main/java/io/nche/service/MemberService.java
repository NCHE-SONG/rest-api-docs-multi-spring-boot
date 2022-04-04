package io.nche.service;

import io.nche.entity.Member;
import io.nche.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@ComponentScan(basePackageClasses = MemberRepository.class)
public class MemberService {

    private final MemberRepository memberRepository;

    public Long signup (Member member) {
        Long id = 1L;
        //id = memberRepository.save(member).getId();
        return id;
    }

}
