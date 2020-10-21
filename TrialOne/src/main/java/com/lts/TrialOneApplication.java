package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		/*Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);
		Student student=context.getBean(Student.class);
		System.out.println(student);*/
		FoodPanda food= context.getBean(FoodPanda.class);
		List<String> list=food.showMenu("indian");
		list.stream().forEach(System.out::println);
		
	}

}