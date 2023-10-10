package com.tech.Servicei;

import java.util.List;

import com.tech.Model.Student;

public interface ServiceI {

	public String saveData(Student sc);
	
	public List< Student> logincheck(String sId, String pass);

	public List<Student> getsSingleData(String sId, String pass);
	
	public List<Student> getAllData();
	
}
                                                                              