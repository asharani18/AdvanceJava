package com.tech.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Entity.Train;
import com.tech.Repository.TrainRepo;
import com.tech.ServiceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	TrainRepo trepo;
	
	@Override
	public String setSingleData(Train t) {
		
		trepo.save(t);
		
	 return "Train Id added successfully";
	}

	@Override
	public String setMultipleData(List<Train> lt) {
		
		trepo.saveAll(lt);
		
		return "all trains data Added Successfully";
	}
	

	@Override
	public Optional<Train> getSingleData(int trainId) {
		
	   Optional<Train> op = trepo.findById(trainId);
		return op ;
	}

	@Override
	public String getAllData(List<Train> trl) {
		
		Iterable<Train> findAll = trepo.findAll();
		return "get All data" ;
	}

	@Override
	public String updateData(Train trd)
	{
	 Train save = trepo.save(trd);
	 
		return "data updated ";
	}

	@Override
	public String deleteData(int trainId) 
	{
		
	     trepo.deleteById(trainId);
	
		return "data deleted";
	}

	
	}


