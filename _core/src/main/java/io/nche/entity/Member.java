package io.nche.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Member {
    @Id
    @Getter
    @GeneratedValue
    private Long id;

    @Column
    @Getter
    private String name;

    @Column
    @Getter
    private String email;

    @Builder
    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }
}
