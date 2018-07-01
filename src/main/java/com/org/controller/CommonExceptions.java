package com.org.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class CommonExceptions {

	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ValidExceptions.class)
	@ResponseBody
	public List<ErrorDto> valid(ValidExceptions e)
	{
		List<ErrorDto> l=new ArrayList<ErrorDto>();
		ErrorDto d=null;
		BindingResult res = e.getBind();
		if(res!=null){
		
		List<FieldError> fieldErrors = res.getFieldErrors();
		
		for(FieldError error:fieldErrors)
		{
			 String message = error.getDefaultMessage();
			 d=new ErrorDto();
			 d.setCode(error.getField());
			 d.setMessage(error.getDefaultMessage());
			 //d.addFieldError(error.getField(), message);
			l.add(d);
		  
		}
		}
		return l;
	}	

	
	
}
