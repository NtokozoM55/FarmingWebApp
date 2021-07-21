package com.farmingapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.farmingapp.Models.SupplierModel;

public interface SupplierRepository extends CrudRepository<SupplierModel, Integer> {

}
