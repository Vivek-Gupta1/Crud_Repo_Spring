package com.vivek.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Emp_Details")
public class Employee {
    
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empPost;
}
