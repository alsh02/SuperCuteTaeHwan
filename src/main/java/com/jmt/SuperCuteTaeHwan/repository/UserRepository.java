package com.jmt.SuperCuteTaeHwan.repository;

import com.jmt.SuperCuteTaeHwan.domain.User;

public interface UserRepository {
    void save(User u);
    User findByName(String name);
}
