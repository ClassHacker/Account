package com.details.demo2.repo;

import org.springframework.data.repository.CrudRepository;

import com.details.demo2.bean.Account;

public interface AccountRepo extends CrudRepository<Account, Integer> {

}
