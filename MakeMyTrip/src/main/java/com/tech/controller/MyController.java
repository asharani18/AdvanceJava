package com.tech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Entity.Train;
import com.tech.ServiceI.ServiceI;


@RestController
@RequestMapping("tracontroller")
public class MyController {

	@Autowired
	ServiceI si;

	
	// save single Data
	@PostMapping("train/add") 
	public ResponseEntity<String> setSingleTrainData(@RequestBody  Train tr) 
	{
		
	String setData = si.setSingleData(tr);
		
		return  new ResponseEntity<String>(setData ,HttpStatus.CREATED);
		
	}
	
	//save Multiple Data
	@PostMapping("trains/add")
	public ResponseEntity<String> setMultipleTrainsData(@RequestBody List<Train> trs)
	{
		  String trns =   si.setMultipleData(trs);
		    
		return new ResponseEntity<String>(trns , HttpStatus.CREATED);
		
	}
	
	//get Single data
	@GetMapping("train/get")
	public ResponseEntity<Object> getSingleTrainData(@PathVariable("trinId") int trainId)
	{
		Optional<Train> optional= si.getSingleData(trainId);
		
		return  new ResponseEntity<Object>(optional , HttpStatus.ACCEPTED);
	}
	
	// get Multiple Data
	@GetMapping("trains/get")
	public ResponseEntity<String> getAllTrainData(@PathVariable  List<Train> trainId) 
	{
		String allData = si.getAllData(trainId);
		
		return new ResponseEntity<String>(allData  , HttpStatus.ACCEPTED);	

	}
	
	
	//update data
	@PutMapping("train/update")
	public ResponseEntity<String> updateSingleData(@RequestBody Train trd)
	{
		String updateData = si.updateData(trd);
		
		return new ResponseEntity<String>(updateData , HttpStatus.CREATED);
		
	}
	
	//delete data
	@DeleteMapping("train/delete")
	public ResponseEntity<String> deleteData(@PathVariable("trainId") int trainId)
	{
		String deleteData = si.deleteData(trainId);
		
		return new ResponseEntity<String>(deleteData , HttpStatus.OK);
		
	}
	
	
}
