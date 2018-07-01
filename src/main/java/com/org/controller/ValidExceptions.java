package com.org.controller;

import org.springframework.validation.BindingResult;

public class ValidExceptions extends Exception {

	BindingResult bind;

	public BindingResult getBind() {
		return bind;
	}

	public void setBind(BindingResult bind) {
		this.bind = bind;
	}
	
	
	
	
	
}
