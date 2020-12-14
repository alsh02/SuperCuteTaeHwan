package com.jmt.SuperCuteTaeHwan;

import com.jmt.SuperCuteTaeHwan.repository.UserRepository;
import com.jmt.SuperCuteTaeHwan.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigure {

    UserRepository userRepository;

    public SpringConfigure(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public UserService userService() { return new UserService(userRepository); }
}
