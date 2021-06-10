package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
