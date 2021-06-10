package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {
}
