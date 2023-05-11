package com.billcom.webservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.billcom.webservice.model.Contract;

@Repository 
public interface ContractRepository extends JpaRepository<Contract, Long>  {
	
	@Query(value = "SELECT * FROM contract_all c JOIN rateplan r ON c.tmcode = r.tmcode WHERE c.co_id = :id", nativeQuery = true)
	Optional<Contract> findRateplanById(@Param("id") Long id);

}
