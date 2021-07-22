package com.farmingapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.farmingapp.Models.AdModel;

public interface AdRepository extends CrudRepository<AdModel, Integer> {

}
