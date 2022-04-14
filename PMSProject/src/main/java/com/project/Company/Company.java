package com.project.Company;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companymaster")
public class Company {
	@Id
	private int companyId;
	private String companyNmae;
	
	
	private String companyType;
	private String companyAddress;
	private String companyEmail;
	
	private String companyContact;
	private int noOfReq;
	private int rating;
	
	

}
