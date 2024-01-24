package com.event_mgmt.event;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.dao.CustomerDao;
	import com.model.Customer;

	@RestController
	public class CustomerController {

		@Autowired
		CustomerDao customerDao;

		@GetMapping("getCustomers")
		public List<Customer> getCustomers(){
			return customerDao.getCustomers();
		}

		@GetMapping("getCustomerByName/{userName}")
		public Customer getCustomerByName(@PathVariable("userName") String userName){
			return customerDao.getCustomerByName(userName);
		}

		@PostMapping("registerCustomer")
		public String registerCustomer(@RequestBody Customer cust){
			customerDao.registerCustomer(cust);
			return "Customer Registered Successfully !!!";
		}

		@PutMapping("updateCustomer")
		public String updateCustomer(@RequestBody Customer cust){
			customerDao.updateCustomer(cust);
			return "Customer Updated Successfully !!!";
		}

		@DeleteMapping("deleteCustomerByName/{userName}")
		public String deleteByName(@PathVariable("userName") String userName){
			customerDao.deleteByName(userName);
			return "Customer Deleted Successfully !!!";
		}

		@GetMapping("cLogin/{emailId}/{password}")
		public Customer cLogin(@PathVariable("emailId") String emailId, @PathVariable("password") String password){
			Customer c = customerDao.getCustomerByEmailId(emailId);
			if(c != null){
				
				
					return c;
				
			}
			return null;
		}



}
