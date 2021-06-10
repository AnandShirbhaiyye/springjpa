package com.jpaproject1.springjpa1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
public class Department {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    Set<Employee> employeeSet;
}
