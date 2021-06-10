package com.jpaproject1.springjpa1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Setterhttps://github.com/AnandShirbhaiyye/springjpa.git
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @ManyToMany
    @JoinTable(name = "customer_product",
            joinColumns = @JoinColumn(name = "cust_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "prod_id",referencedColumnName = "id"))
    private Set<Product> productSet;
}
