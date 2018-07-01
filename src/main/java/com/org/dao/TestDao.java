package com.org.dao;

import org.springframework.stereotype.Repository;

import com.org.controller.Person;

@Repository("testDao")
public class TestDao {

	
	
	public Person getdata() {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setId(121);
		p.setName("hiii");
		return p;
		
		
		
		
		
		
		
		
	}

}
