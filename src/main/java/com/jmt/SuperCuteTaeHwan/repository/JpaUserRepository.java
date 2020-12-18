package com.jmt.SuperCuteTaeHwan.repository;

import com.jmt.SuperCuteTaeHwan.domain.User;

import javax.persistence.EntityManager;

public class JpaUserRepository implements UserRepository {

    EntityManager em;

    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(User u) {
        em.persist(u);
    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
