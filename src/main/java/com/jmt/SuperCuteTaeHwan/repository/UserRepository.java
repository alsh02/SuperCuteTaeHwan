package com.jmt.SuperCuteTaeHwan.repository;

import com.jmt.SuperCuteTaeHwan.domain.User;

public interface UserRepository {
    User save(User u);
    User findByName(String name);
    User deleteUser(String name);
}
