
	package com.dao;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.stereotype.Service;

	import com.model.Customer;


	@Service
	public class CustomerDao {

		@Autowired
		CustomerRepository customerRepository;


		public List<Customer> getCustomers(){
			return customerRepository.findAll();
		}

		public Customer getCustomerByName(String uname){
			return customerRepository.findByName(uname);
		}
		public Customer deleteByName(String uname){
			return customerRepository.deleteByName(uname);
		}
		

		public void registerCustomer(Customer customer){
			customerRepository.save(customer);
		}

		public void updateCustomer(Customer customer){
			String encryptPwd = customer.getPassword();
			customer.setPassword(encryptPwd);
			customerRepository.save(customer);
		}


		public Customer getCustomerByEmailId(String emailId){
			return customerRepository.findByEmailId(emailId);
		}
		public Customer cLogin(String emailId,String password){
			return customerRepository.cLogin(emailId,password);
		}



		public Customer getStudentByPhoneNo(String phoneNo) {
			return customerRepository.findByPhoneNo(phoneNo);
		}



}
