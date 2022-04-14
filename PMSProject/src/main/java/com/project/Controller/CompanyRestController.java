package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.Company.Company;
import com.project.CompanyService.CompanyService;

@RestController
@RequestMapping("/Company")

public class CompanyRestController {
	@Autowired
	CompanyService service;
	
	@RequestMapping(value="/addCompany",method=RequestMethod.POST)
	public ResponseEntity<Company> addCompany(@RequestBody Company h){
	service.addCompany(h);

	return new ResponseEntity<Company>(h,HttpStatus.OK);

	}
	/*@PostMapping("/addCompany")
	public ResponseEntity<String> addCompany(@Validated @RequestBody Company c)
	{
		System.out.println(c);
		Company cy=service.addCompany(c);
		return new ResponseEntity<String>("Company registered Successfull",HttpStatus.OK);
	}*/
	@GetMapping("/fetchById/{id}")
	public ResponseEntity<Company> fetchById(@PathVariable String id)
	{
		System.out.println(id);
		Company obj=service.findById(id);
		System.out.println(obj);
		return new ResponseEntity<Company> (obj, HttpStatus.OK);
	}
	/*@PutMapping("/fetchById1/{id}")
	public ResponseEntity<Company> fetchById1(@PathVariable String id)
	{
		System.out.println(id);
		Company obj=service.findById1(id);
		System.out.println(obj);
		return new ResponseEntity<Company> (obj, HttpStatus.OK);
	}*/
}
