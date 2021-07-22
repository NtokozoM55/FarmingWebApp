package com.farmingapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.farmingapp.Models.OfferModel;

public interface OfferRepository extends CrudRepository<OfferModel, Integer> {

}
