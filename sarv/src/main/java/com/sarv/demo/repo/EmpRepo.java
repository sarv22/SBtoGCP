package com.sarv.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarv.demo.model.Emp;

@Repository
public interface EmpRepo extends CrudRepository<Emp, Long> {
	

}
