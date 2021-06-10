package com.jpaproject1.springjpa1.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "productSet")
    private Set<Customer> customerSet;
}
