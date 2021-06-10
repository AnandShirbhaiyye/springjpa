package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
