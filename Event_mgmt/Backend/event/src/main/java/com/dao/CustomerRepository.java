
	package com.dao;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;
	import org.springframework.stereotype.Repository;

	import com.model.Customer;

	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, String> {
		@Query("from Customer c where c.emailId = :emailId and c.password = :password")
		Customer cLogin(@Param("emailId") String emailId, @Param("password") String password);
		@Query("from Customer c where c.emailId = :emailId")
		Customer findByEmailId(@Param("emailId") String emailId);
		@Query("from Customer c where c.PhoneNo = :PhoneNo")
		Customer findByPhoneNo( @Param("PhoneNo") String PhoneNo);
		@Query("from Customer c where c.userName = :userName" )
		Customer deleteByName(@Param("userName") String userName);
		@Query("from Customer c where c.userName = :userName" )
		Customer findByName(@Param("userName") String userName);
		
	}

