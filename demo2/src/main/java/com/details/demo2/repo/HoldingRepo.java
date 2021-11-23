package com.details.demo2.repo;

import org.springframework.data.repository.CrudRepository;

import com.details.demo2.bean.Holding;

public interface HoldingRepo extends CrudRepository<Holding, Integer>{

}
