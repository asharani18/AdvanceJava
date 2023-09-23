package com.tech.ServiceI;

import java.util.List;
import java.util.Optional;

import com.tech.Entity.Train;

public interface ServiceI {

	
	// save single Data
	public String setSingleData(Train t);
	
	
	//save Multiple Data
	public String setMultipleData(List<Train> lt);
	
	
	//get Single data
	public Optional<Train> getSingleData(int trainId);
	
	
	// get Multiple Data
	public String getAllData(List<Train> trl);
	
	
	//update data
	public String updateData(Train trd);

	//delete Data
	public String deleteData(int trainId);


	
	
	
}
