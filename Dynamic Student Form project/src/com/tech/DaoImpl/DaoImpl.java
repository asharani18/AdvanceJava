package com.tech.DaoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.DaoI.DaoI;
import com.tech.Model.Student;

@Repository
public class DaoImpl implements DaoI
{
    @Autowired
	SessionFactory sf;
	
	@Override
	public String saveData(Student sc) {
		Session s= sf.openSession();
        Transaction tx=s.beginTransaction();
        s.saveOrUpdate(sc);
        
        tx.commit();
        s.close();
        
		return "FirstName";
		
	}

	@Override
	public List<Student> logincheck(String sId, String pass) {
		Session s= sf.openSession();
		 Query q= s.createQuery("From Student");
		 List<Student> ac=  q.getResultList();
		 
		return ac;
	}

	@Override
	public List<Student> getsSingleData(String sId, String pass) {
		Session s= sf.openSession();
		 Query q= s.createQuery("From Student");
		 List<Student> ac=  q.getResultList();
		return ac;
	}

	@Override
	public List<Student> getAllData() {
		Session s= sf.openSession();
		Query q= s.createQuery("From Student");
		 List<Student> ac=  q.getResultList();
		 
		return ac;
	}

	
}
