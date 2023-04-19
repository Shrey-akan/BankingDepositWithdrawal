package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Deposite;
import com.demo.repository.Bankrepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Bankingcontroller {
	
	
	@Autowired
	private Bankrepository brepo;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/depositeservice")
	public Deposite depositservice(@RequestBody Deposite d)
	{
		int first = d.getAccid();
		String name = d.getAccname();
		double third = d.getAccbal();
		
		double oldbal = oldbalance(first);
		
		third = third+oldbal;
		d.setAccid(first);
		d.setAccname(name);
		d.setAccbal(third);
		return brepo.save(d);
		
		
	}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/withdrawlservice")
	public Deposite withdrawlservice(@RequestBody Deposite d)
	{
		int first = d.getAccid();
		String name = d.getAccname();
		double third = d.getAccbal();
		
		double oldbal = oldbalance(first);
		if(oldbal>third) {
			third = oldbal-third;
		}		
		d.setAccid(first);
		d.setAccname(name);
		d.setAccbal(third);
		return brepo.save(d);
		
		
	}
	public double oldbalance(int bid1)
	{
		
		Deposite d1 = this.brepo.getById(bid1);
		return (d1.getAccbal());
	}
	
	
}
