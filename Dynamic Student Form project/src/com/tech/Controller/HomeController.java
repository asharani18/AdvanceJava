package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tech.Model.Student;
import com.tech.Servicei.ServiceI;

@Controller
public class HomeController {

	@Autowired
	ServiceI si;
	
	@RequestMapping("/stu")
	public String saveData(Student sc)
	{
	String FirstName = si.saveData(sc);
	
		if(FirstName!=null) 
		{
			return "index";
		}
		else 
		{
			return "studentform";
		}
		
	}
	@RequestMapping("/log")
	public String getData(@RequestParam("sId")String Id,@RequestParam("pass")String pass,Student sc,Model m) 
	{
		if(Id.equals("b01") && pass.equals("admin")) 
		{
		List<Student>lc= si.logincheck(Id, pass);
		m.addAttribute("data", lc);
		
		
		return "sucess1";           
		
		} else if (Id.equals(Id) && pass.equals(pass))
		{
			List<Student> acc = si.getsSingleData(Id, pass);
			m.addAttribute("data",acc);
			
			return "sucess1";                                                                          
		}
		return "index";                                                                                              
		
	}

	}
