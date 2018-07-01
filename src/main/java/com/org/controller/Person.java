package com.org.controller;

import javax.validation.constraints.NotNull;


public class Person {

	private int id;
	
	//@NotEmpty(message="sueperrrrr")
	@NotNull(message="name not null")
	private String name;
	@NotNull(message="subject not null")
    private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
    
    
    
	
	
}
