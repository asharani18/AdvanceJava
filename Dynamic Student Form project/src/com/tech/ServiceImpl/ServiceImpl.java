package com.tech.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.DaoI.DaoI;
import com.tech.Model.Student;
import com.tech.Servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	DaoI di;

	@Override
	public String saveData(Student sc) {

		return di.saveData(sc);
	}

	@Override
	public List<Student> logincheck(String sId, String pass) {
		
		return di.logincheck(sId, pass);
	}

	@Override
	public List<Student> getsSingleData(String sId, String pass) {
		
		return di.logincheck(sId, pass);
	}

	@Override
	public List<Student> getAllData() {
	
		return di.getAllData();
	}

}
