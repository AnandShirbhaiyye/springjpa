package com.jpaproject1.springjpa1.Repository;

import com.jpaproject1.springjpa1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

     @Query(value = "select distinct c.name from customer c,customer_product cp,product p where c.id=cp.cust_id and cp.prod_id=p.id and p.name in('pencil','pen','scale','ankit')", nativeQuery = true)
     List<Map<String, Object>> getAllCustomersByProduct();

     @Query(value = "select distinct c.name from customer c,customer_product cp,product p where c.id=cp.cust_id and cp.prod_id=p.id and p.name in(?,?,?,?)", nativeQuery = true)
     List<Map<String, Object>> getAllCustomers(String name1, String name2, String name3, String name4);

     @Query(value = "select distinct c.name from customer c,customer_product cp,product p where c.id=cp.cust_id and cp.prod_id=p.id and p.name in(:products)", nativeQuery = true)
     List<Map<String, Object>> getAllCustomersByPartucularProduct(@Param("products") List<String> products);

     @Query(value = "select c.name from customer as c left join customer_product as cp on cp.cust_id=c.id where cp.cust_id is null",nativeQuery = true)
     List<Map<String,Object>>getAllCustomersWithNoProducts();

     @Query(value = "select p.name from product as p left join customer_product as cp on cp.prod_id=p.id where cp.prod_id is null",nativeQuery = true)
     List<Map<String,Object>>getAllProductsNotSold();
}