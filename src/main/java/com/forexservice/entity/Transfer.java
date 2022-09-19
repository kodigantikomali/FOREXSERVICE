package com.forexservice.entity;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




	@Entity
	//@Table(name="Transfer") 
	
	public class Transfer {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer transferId;
		
		private String bankname;
		
		private Long accountnumber;
		
		private String city;
		private int ifsccode;
		private String accounttype;
		private String userid;
		
		
		public Transfer() {
			super();
		}


		public Transfer(Integer transferId, String bankname, Long accountnumber, String city, int ifsccode,
				String accounttype, String userid) {
			super();
			this.transferId = transferId;
			this.bankname = bankname;
			this.accountnumber = accountnumber;
			this.city = city;
			this.ifsccode = ifsccode;
			this.accounttype = accounttype;
			this.userid = userid;
		}


		public Integer getTransferId() {
			return transferId;
		}


		public void settransferId(Integer transferId) {
			this.transferId = transferId;
		}


		public String getBankname() {
			return bankname;
		}


		public void setBankname(String bankname) {
			this.bankname = bankname;
		}


		public Long getAccountnumber() {
			return accountnumber;
		}


		public void setAccountnumber(Long accountnumber) {
			this.accountnumber = accountnumber;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public int getIfsccode() {
			return ifsccode;
		}


		public void setIfsccode(int ifsccode) {
			this.ifsccode = ifsccode;
		}


		public String getAccounttype() {
			return accounttype;
		}


		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}


		public String getUserid() {
			return userid;
		}


		public void setUserid(String userid) {
			this.userid = userid;
		}


		
		}
	
	
