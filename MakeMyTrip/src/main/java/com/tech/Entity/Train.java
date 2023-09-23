package com.tech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Train {
@Id
	private int trainId;
	
	private String trainName;
	
	private String trainDespatureTime;
	
	private String trainArrivalTime;
	
	private String trainDespatureDate;
	
	private String trainArrrivalDate;
	
	private String availableSeats;
	

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainDespatureTime() {
		return trainDespatureTime;
	}

	public void setTrainDespatureTime(String trainDespatureTime) {
		this.trainDespatureTime = trainDespatureTime;
	}

	public String getTrainArrivalTime() {
		return trainArrivalTime;
	}

	public void setTrainArrivalTime(String trainArrivalTime) {
		this.trainArrivalTime = trainArrivalTime;
	}

	public String getTrainDespatureDate() {
		return trainDespatureDate;
	}

	public void setTrainDespatureDate(String trainDespatureDate) {
		this.trainDespatureDate = trainDespatureDate;
	}

	public String getTrainArrrivalDate() {
		return trainArrrivalDate;
	}

	public void setTrainArrrivalDate(String trainArrrivalDate) {
		this.trainArrrivalDate = trainArrrivalDate;
	}

	public String getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	
}
