package com.srivani;

public class Employee {
	int id ;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		System.out.println("checking constructor with data u passed "+id+" "+name +" "+age);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id set by setter method");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name set by setter method");

		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("age set by setter method");

		this.age = age;
	}
	public String displayInfo() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
