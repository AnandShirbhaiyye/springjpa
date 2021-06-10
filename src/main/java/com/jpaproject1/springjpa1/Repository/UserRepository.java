package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
