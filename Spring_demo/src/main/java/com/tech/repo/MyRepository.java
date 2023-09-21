package com.tech.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tech.Entity.Employee;

@Repository
public interface MyRepository extends CrudRepository<Employee, Integer> {

	
	public List<Employee>findBySalary(double Salary);

    public List<Employee>findByFirstname(String firstname);

	public List<Employee>findByFirstnameAndLastname(String firstname,String lastname);
	
    public List<Employee>findByFirstnameOrSalary(String name, double salary);

	public List<Employee>findBySalaryLessThan(double salary);
	
	public List<Employee>findBySalaryLessThanEqual(double salary);
	
	public List<Employee>findBySalaryGreaterThan(double salary);
	
	public List<Employee>findBySalaryGreaterThanEqual(double salary);
	
  //public List<Employee>findByStartSalaryAfter(double salary);
	
	public List<Employee>findByFirstnameLike(String firstname);

	public List<Employee>findByFirstnameNotLike(String firstname);

	public List<Employee>findByFirstnameStartingWith(String Firstname);
	
	public List<Employee>findByFirstnameEndingWith(String Firstname);
	
	public List<Employee>findByFirstnameContaining(String Firstname);
	
	public List<Employee>findBySalaryOrderByLastnameDesc(double salary);
	
	public List<Employee>findByLastnameNot(String lastname);
	
	public List<Employee>findByFirstnameIgnoreCase(String Firstname);
	
	public List<Employee>findDistinctByLastnameAndFirstname(String lastname,String Firstname);
  
	public List<Employee>findByFirstnameIs(String firstname);
	
	public List<Employee>findByLastnameEquals(String lastname);
	
	public List<Employee>findBySalaryBetween(double x, double y);

	
}



















