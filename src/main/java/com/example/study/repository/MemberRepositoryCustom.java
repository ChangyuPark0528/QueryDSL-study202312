package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<Member> findByName(String name);

    // WHERE절에 BooleanExpression을 리턴하는 메서드를 사용합니다.
    List<Member> findUser(String nameParam, Integer ageParam);
}
