package com.org.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.controller.Person;
import com.org.dao.TestDao;

@Service("testservice")
public class Testservice {

	@Autowired
	TestDao testDao;
	
	
  public Person getdata() {
	  
	  return testDao.getdata();
	  
  }
	
	
}
