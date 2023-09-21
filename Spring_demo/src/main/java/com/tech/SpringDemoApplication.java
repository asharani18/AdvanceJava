package com.tech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tech.Entity.Employee;
import com.tech.repo.MyRepository;

@SpringBootApplication
public class SpringDemoApplication {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = SpringApplication.run(SpringDemoApplication.class, args);
		
		MyRepository myrepo =  ap.getBean(MyRepository.class);
		
		//single data
		Employee e = new Employee();
		e.setE_id(107);
        e.setFirstname("deepak");
        e.setLastname("more");
		e.setAddr("Nashik");
		e.setSalary(60000);
		
//		Employee emp = myrepo.save(e);
//		System.out.println(emp);
		
		Employee e1 = new Employee();
		e1.setE_id(105);
        e1.setFirstname("deepika");
        e1.setLastname("kanhe");
		e1.setAddr("pune");
		e1.setSalary(40000);
		
		Employee e2 = new Employee();
		e2.setE_id(106);
		e2.setFirstname("vaishnavi");
		e2.setLastname("pawar");
		e2.setAddr("mumbai");
		e2.setSalary(25000);

//		
//		// multiple data
//		List.of(e,e1,e2);
//		List<Employee> l= new ArrayList<Employee>();
//		l.add(e);
//		l.add(e1);
//		l.add(e2);
//		Iterable<Employee> emps = myrepo.saveAll(l);
//		emps.forEach(Employee->System.out.println(Employee));
		
		
	//	update data
//      Optional<Employee> opt = myrepo.findById(103);
//		Employee ep= opt.get();
//		ep.setSalary(70000);                                                                                                        
//		
//		Employee update = myrepo.save(ep);
//		System.out.println(update);
		
		
		
		// get data
		
//		Optional<Employee>  getData = myrepo.findById(101);
//		Employee employee = getData.get();
//		System.out.println(employee);
//		
//		
//		Iterable<Employee> iterable = myrepo.findAll();
//		Iterator<Employee> itr = iterable.iterator();
//		while(itr.hasNext())
//		{
//			Employee em = itr.next();
//			System.out.println(em);
//		}
//		
//		iterable.forEach(Employee-> { System.out.println(Employee);});
		
		
		//delete Single data
		
//		myrepo.deleteById(101);
//		System.out.println("Data Deleted");
//		
		
//		//delete All Deta
//		Iterable<Employee> ep1 = myrepo.findAll();	
//		emps.forEach(Employee-> System.out.println(Employee));
//		myrepo.deleteAll(ep1);
		
		//findById
//		List<Employee> eps = myrepo.findById(50000);
//		eps.forEach(Employee->System.out.println(Employee));
		
		//findBySalary
//		List<Employee> e3= myrepo.findBySalary(50000);
//		e3.forEach(Employee->System.out.println(Employee));
		
		//findByFirstName
//		List<Employee> e4= myrepo.findByFirstname("Vaishnavi");
//		e4.forEach(Employee->System.out.println(Employee));
		
//		//findByNameAndLastname
//		List<Employee> e5= myrepo.findByFirstnameAndLastname("kiran","chavan");
//		e5.forEach(Employee->System.out.println(Employee));
	
//		//findBynameOrsalary
//		List<Employee> e6 = myrepo.findByFirstnameOrSalary("deepak", 50000);
//		e6.forEach(Employee->System.out.println(Employee));
	
		//findBySalaryLessThan
//		List<Employee> e7=myrepo.findBySalaryLessThan(50000);
//		e7.forEach(Employee->System.out.println(Employee));

		//findBySalarylessThanEqual
//		List<Employee> e8=myrepo.findBySalaryLessThanEqual(40000);
//		e8.forEach(Employee->System.out.println(Employee));
		
		//findByAgeGreaterThan
		
//		List<Employee> e8= myrepo.findBySalaryGreaterThan(30000);
//		e8.forEach(Employee->System.out.println(Employee));
		
//		List<Employee> e7 = myrepo.findBySalaryGreaterThanEqual(60000);
//		e7.forEach(Employee->System.out.println(Employee));
	
//		List<Employee> e7 = myrepo.findByStartSalaryAfter(40000);
//        e7.forEach(Employee->System.out.println(Employee));
        
//        List<Employee> e7 = myrepo.findByFirstnameLike("deepak");
//        e7.forEach(Employee->System.out.println(Employee));
        
//        List<Employee> e7 = myrepo.findByFirstnameNotLike("komal");
//        e7.forEach(Employee->System.out.println(Employee));
        
//        List<Employee> e7 = myrepo.findByFirstnameStartingWith("d");
//        e7.forEach(Employee->System.out.println(Employee));
        
//        List<Employee> e7 = myrepo.findByFirstnameEndingWith("k");
//        e7.forEach(Employee->System.out.println(Employee));
        
//        List<Employee> e7 = myrepo.findByFirstnameContaining("e");
//        e7.forEach(Employee->System.out.println(Employee));
        
//         List<Employee>e7 = myrepo.findBySalaryOrderByLastnameDesc(40000);
//         e7.forEach(Employee->System.out.println(Employee));
        		
//         List<Employee> e7 = myrepo.findByLastnameNot("more");
//         e7.forEach(Employee->System.out.println(Employee));
         
//         List<Employee> e7 = myrepo.findByFirstnameIgnoreCase("VAISHNAVI"); 
//         e7.forEach(Employee->System.out.println(Employee));
            
//	        List<Employee> e7 = myrepo.findDistinctByLastnameAndFirstname("more", "deepak");
//          e7.forEach(Employee->System.out.println(Employee));
         
//		     List<Employee> e7 = myrepo.findByFirstnameIs("Shruti");
//		     e7.forEach(Employee->System.out.println(Employee));

//		     List<Employee> e7  = myrepo.findByLastnameEquals("kanhe");
//		    e7.forEach(Employee->System.out.println(Employee));
		
	     	List<Employee> e7 = myrepo.findBySalaryBetween(30000, 40000);
	    	e7.forEach(Employee->System.out.println(Employee));
	    	
	    	
	    	
   }
	
}
