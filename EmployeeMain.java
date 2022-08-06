package com.testing;
/*
create Employee class-set variable name,monthlySalary,age.

Add setter getter 

Create EmployeeBusinessLogic class-
Create method calculateYearlySalary () 
to calculate yearly salary of employee

Create method calculateAppraisal() 
to calculate the appraisal amount of employee 
based on condition:if monthly salary is 
<10000 :appraisal=500 else 1000;

Create test cases to test these two method
*/

class Employee{
	private String name;
	private int monthlySalary;
	private int age;
	
	
	public Employee(String name, int monthlySalary, int age) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class EmployeeBusinessLogic{
	
	int calculateYearlySalary(int monthlySalary) {
		return monthlySalary*12;
		}
	
	int calculateAppraisal(int monthlySalary) {
		int appraisal;
		if(monthlySalary<10000) {
			appraisal = 500;
			//System.out.println(appraisal);
		}
		else {
			appraisal = 1000;
			//System.out.println(appraisal);
		}
		return appraisal;
		
	}
	
	
}

public class EmployeeMain{
	public static void main(String[] args) {
		Employee emp=new Employee("Ajay", 25000, 25);
		emp.setMonthlySalary(2000);
		System.out.println("Employee name : "+emp.getName()+"\nEmployee age : "+emp.getAge()+"\nEmployee Monthly Salary is : "+emp.getMonthlySalary());
		
		EmployeeBusinessLogic cal=new EmployeeBusinessLogic();
		System.out.print("Yearly Salary is : ");
		System.out.println(cal.calculateYearlySalary(emp.getMonthlySalary()));
		
		System.out.print("The Appraisal Amount is : ");
		System.out.println((cal.calculateAppraisal(emp.getMonthlySalary())));
		
	}
}
