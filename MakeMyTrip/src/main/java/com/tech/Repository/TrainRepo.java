package com.tech.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.Entity.Train;


public interface TrainRepo extends CrudRepository<Train, Integer>{

}
