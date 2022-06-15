package com.progrank.customer_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_address")
	private String custAddress;
	
	@Column(name="p_id")
	private Long pId; //(Foreign key)
	

}
