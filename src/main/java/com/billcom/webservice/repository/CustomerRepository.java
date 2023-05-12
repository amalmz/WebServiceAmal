package com.billcom.webservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.billcom.webservice.model.Customer;


@Repository
//@PropertySource("classpath:queries.properties")
public interface CustomerRepository extends JpaRepository<Customer, Long>  {
	
	@Query("SELECT c FROM Customer c JOIN FETCH c.contact WHERE c.CUSTOMER_ID = :id")
	Optional<Customer> findInfoById(@Param("id") Long id);
	@Query("SELECT DISTINCT c FROM Customer c LEFT JOIN FETCH c.contracts WHERE c.CUSTOMER_ID = :id")
	Optional<Customer> findContractById(@Param("id") Long id);


}
