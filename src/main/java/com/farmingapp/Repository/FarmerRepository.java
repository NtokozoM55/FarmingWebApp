package com.farmingapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.farmingapp.Models.FarmerModel;

public interface FarmerRepository extends CrudRepository<FarmerModel, Integer> {

}
