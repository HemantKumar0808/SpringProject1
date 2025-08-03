package com.example.SpringProject1;

import Models.Address;
import Models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject1Application.class, args);

////		tight coupling
//		Employee emp1 = new Employee();
//		emp1.id = 12;
//		emp1.name = "ajay";
//		emp1.email = "ajay123@gmail.com";
//		emp1.Designation = "Developer";
//		Address address1 = new Address();
//		address1.HNo = 654;
//		address1.StreetName = "Jeevan bihar";
//		address1.CityName = "noida";
//		address1.State = "UP";

//		emp1.address = address1;

//		System.out.println("emp1 : " + emp1);
//		System.out.println("emp1 Address : " + address1);
//
//		address1.CityName = "gurugram";
//		address1.State = "Haryana";
//
//		System.out.println("emp1 : " + emp1);
//		System.out.println("emp1 Address : " + address1);

//		 loose coupling
//		setter injection

		Employee emp2 = new Employee();
		emp2.setId(22);
		emp2.setName("Karan");
		emp2.setEmail("karan123@gmail.com");
		emp2.setDesignation("Developer");

		Address address2 = new Address();
		address2.setHNo(235);
		address2.setStreetName("ram nagar");
		address2.setCityName("england");
		address2.setState("london");

		emp2.setAddress(address2); // 👈 Inject ho raha hai (NOT created inside Employee)

		System.out.println(emp2);
		System.out.println(address2);

//		address2.setState("MP"); // wrong way to change value;
		emp2.getAddress().setState("MP");

		System.out.println(emp2);
		System.out.println(address2);

//		constructor injection
		Address address3 = new Address(125,"kakroi marg","bharatpur", "Gujrat");
		Employee emp3 = new Employee(42,"sanjay","sanjay123@gmail.com","SDE2",address3);

		System.out.println(emp3);
		System.out.println(address3);

		emp3.getAddress().setState("Rajasthan");

		System.out.println(emp3);
		System.out.println(address3);
	}



}