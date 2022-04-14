package com.project.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Company.Company;
import com.project.Repository.CompanyRepo;

@Service

public class CompanyService {
	@Autowired
	CompanyRepo repo;
	public Company addCompany(Company c)

	{
		return repo.save(c);
		
	}
	public Company findById(String id)
	{
		return repo.findByCompanyId(id);
	}
	public Company findById1(String id)
	{
		return repo.findByCompanyId(id);
	}
}
