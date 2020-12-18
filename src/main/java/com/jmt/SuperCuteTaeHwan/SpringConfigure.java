package com.jmt.SuperCuteTaeHwan;

import com.jmt.SuperCuteTaeHwan.repository.JpaUserRepository;
import com.jmt.SuperCuteTaeHwan.repository.UserRepository;
import com.jmt.SuperCuteTaeHwan.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfigure {

    EntityManager em;

    public SpringConfigure(EntityManager em) {
        this.em = em;
    }

    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }

    @Bean
    public UserRepository userRepository()
    {
        return new JpaUserRepository(em);
    }
}