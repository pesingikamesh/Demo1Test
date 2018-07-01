package com.org.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.org.servcie.Testservice;

@RestController
@RequestMapping("/bi")
public class TestController {
    @Autowired
	Testservice testservice;
	
/*sdlkfjskdjfk*/

	/*
	@RequestMapping(value="hi",method=RequestMethod.POST)
	public Person getdata() {
	
		return testservice.getdata();
		//return "success";
	}
	*/
    
    @RequestMapping(value="/hi",method=RequestMethod.GET)
	public String getdata1() {
		//return testservice.getdata();
		return "success";
	}
	
	@RequestMapping(value="hi2",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Person savedata(@RequestBody @Valid Person p,BindingResult result) throws ValidExceptions {
		
		System.out.println("111111");
		if(result.hasErrors()) {
			ValidExceptions valid=new ValidExceptions();
			valid.setBind(result);
			throw valid;
		}
		
		return p;
		
	}
	
	

}
