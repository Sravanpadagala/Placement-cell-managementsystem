package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Company.Company;
@Repository

public interface CompanyRepo extends JpaRepository<Company,String> {
	public Company findByCompanyId(String companyId);

}
