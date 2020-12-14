package com.jmt.SuperCuteTaeHwan.repository;

import com.jmt.SuperCuteTaeHwan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPAUserRepository extends JpaRepository<User, Integer>, UserRepository {
}
