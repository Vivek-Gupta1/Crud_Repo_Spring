package com.vivek.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vivek.Entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{
	
//	select * from Employee where empSalary>sal
List<Employee>findByEmpSalaryGreaterThan(double sal);

//     select * from Employee where empSalary<sal
//we have LessEquals
List<Employee>findByEmpSalaryLessThan(double sal);

//select * from Employee where EmpName=name
List<Employee>findByEmpName(String name);

//select * from Employee where EmpPost=post

List<Employee>findByEmpPost(String post);




}
