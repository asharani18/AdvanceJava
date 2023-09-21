package com.tech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
@Id
	private int e_id;
	
	private String firstname;
	
	private String lastname;
	
	private String addr;
	
	private double salary;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", firstname=" + firstname + ", lastname=" + lastname + ", addr=" + addr
				+ ", salary=" + salary + "]";
	}

	
	

	}

	
