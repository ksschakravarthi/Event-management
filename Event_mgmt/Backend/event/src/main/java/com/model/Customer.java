	package com.model;

//	import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	
	@Entity
	public class Customer {
		@Id@GeneratedValue
		private int userId;
//	    @Column(unique = true, nullable = false)
		private String userName;
		private String gender;
		private String country;
		private String address;
		private String emailId;
		private String password;
		private String PhoneNo;
//	    private Date dob;
		public Customer() {
			super();
		}
		public Customer(int userId,String userName,String gender,  String country, String address, String emailId,
				String password, String phoneNo ) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.gender = gender;
			this.country = country;
			this.address = address;
			this.emailId = emailId;
			this.password = password;
			this.PhoneNo = phoneNo;
//			this.dob = dob;
		}
		public int getuserId() {
			return userId;
		}
		public void setuserId(int userId) {
			this.userId = userId;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getuserName() {
			return userName;
		}
		public void setuserName(String userName) {
			this.userName = userName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhoneNo() {
			return PhoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.PhoneNo = phoneNo;
		}
//		public Date getDob() {
//			return dob;
//		}
//		public void setDob(Date dob) {
//			this.dob = dob;
//		}
		
	}


