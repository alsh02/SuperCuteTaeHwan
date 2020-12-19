package com.jmt.SuperCuteTaeHwan.repository;

import com.jmt.SuperCuteTaeHwan.domain.User;

/* 유저 레포지토리 (데이터 베이스 테이블 관리) */
public interface UserRepository {
    void save(User u);
    User findByName(String name);
}
