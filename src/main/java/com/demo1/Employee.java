package com.demo1;

public class Employee {
	
	 private int id;
	 private String name;
	 private Address address;
	 
	 public Employee() {
			
		}
	 
	 
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	void show() {
		System.out.println("id "+id+" name "+name);
		//System.out.println(address.toString());
	}
	
	

}
