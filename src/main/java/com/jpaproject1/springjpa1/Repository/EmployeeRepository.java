package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByNameAndCity(String name,String city);
}
