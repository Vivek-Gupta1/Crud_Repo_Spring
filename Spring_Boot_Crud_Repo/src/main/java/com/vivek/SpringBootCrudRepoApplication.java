package com.vivek;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Entity.Employee;
import com.vivek.Repo.EmpRepo;

@SpringBootApplication
public class SpringBootCrudRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootCrudRepoApplication.class, args);
		EmpRepo bean = run.getBean(EmpRepo.class);
		
		List<Employee> equal = bean.findByEmpSalaryGreaterThan(20000.00);
		for(Employee sal:equal) {
			System.out.println("Geater::"+sal);}
		
		List<Employee> list = bean.findByEmpSalaryLessThan(30000.00);
		for(Employee sal:list) {
			System.out.println("Less"+sal);
		}
		List<Employee> name = bean.findByEmpName("vivek");
		for(Employee emp :name) {
			System.out.println("Names::"+emp);
			
		}
		List<Employee> post = bean.findByEmpPost("developer");
		for(Employee em:post) {
			System.out.println("Posts::"+em);
		}
		
//		
//		Employee emp  = new Employee();
//		emp.setEmpId(2);
//		emp.setEmpName("Pandu");
//		emp.setEmpPost("developer");
//		emp.setEmpSalary(30000.00);
//		bean.save(emp);
//		
//		Employee emp1  = new Employee();
//		emp1.setEmpId(4);
//		emp1.setEmpName("raju");
//		emp1.setEmpPost("ManualTester");
//		emp1.setEmpSalary(15000.00);
//		bean.save(emp1);
//		bean.saveAll(Arrays.asList(emp,emp1));
//		System.out.println("Data Insert!!!");
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		long count = bean.count();
//		System.out.println(count);
//++++++++++++++++++++++++++++++++++++++++++
//		
//		Optional<Employee> id = bean.findById(1);
//		 if(id.isPresent()) {
//			 System.out.println(id);
//		 }
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        boolean byId = bean.existsById(1);
//        System.out.println(byId);
//		++++++++++++++++++++++++++++++++++++++++++++++++++
//		Iterable<Employee> id = bean.findAllById(Arrays.asList(1,3,5,6));
//		for(Employee status:id) {
//			System.out.println(status);
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		Iterable<Employee> all = bean.findAll();
//		for(Employee emp:all) {
//			System.out.println(emp);
//		}
     //deleteById();
//		deleteAllById
//		delete(Entity)
//		deleteAll(Itrable entity)
//		DeleteAll
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		 
//		if(bean.existsById(3)) {
//			bean.deleteById(3);
//		}else
//		System.out.println("Record Not Found");
//	}

}
}