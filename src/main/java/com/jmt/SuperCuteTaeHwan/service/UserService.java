package com.jmt.SuperCuteTaeHwan.service;

import com.jmt.SuperCuteTaeHwan.domain.User;
import com.jmt.SuperCuteTaeHwan.repository.JpaUserRepository;
import com.jmt.SuperCuteTaeHwan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /* 데이터 베이스 저장 */
    public void join(User u) {
        userRepository.save(u);
    }

    /* 처음 입력한 이름을 기반으로 검색함. */
    public User findUser(String name) {
        return userRepository.findByName(name);
    }
}
