package com.sarv.demo.services;

import java.util.List;

import com.sarv.demo.model.Emp;

public interface EmpService {
	
	 List<Emp> getEmps();
	
	Emp getEmpById(Long empid);
	
	Emp insert (Emp emp);
	
	void updateEmp(Long empid, Emp emp);
	
	void deleteEmp(Long empid);

}
