package com.jmt.SuperCuteTaeHwan.service;

import com.jmt.SuperCuteTaeHwan.domain.User;
import com.jmt.SuperCuteTaeHwan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void join(User u) {
        userRepository.save(u);
    }

    public User findUser(String name) {
        return userRepository.findByName(name);
    }
}
