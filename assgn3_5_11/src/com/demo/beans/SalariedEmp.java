package com.demo.beans;
import com.demo.beans.*;
public class SalariedEmp extends Employee
{
	
	private double salary;
	private double bonus;
	
	
	public SalariedEmp(String name,int mobile,String dept,String desg,double sal,double bonus,int cnt)
	{
	
		super(name,mobile,dept,desg,cnt);
	
		this.salary=sal;
		this.bonus=bonus;
		System.out.println("in salariedEmp constructor salary is="+salary+" bonus= "+bonus);	
	}

	
		
	public double getSalEmployee_salary()
	{
		return salary;
	} 
	public void setSalEmployee_salary(double salary)
	{
		this.salary=salary;
	}

	public double getSalEmployee_bonus()
	{
		return bonus;
	} 
	public void setSalEmployee_bonus(double bonus)
	{
		this.bonus=bonus;
	}

	public String toString()
	{
		
		return super.toString()+"salary is = "+salary+"\nbonus is = "+bonus;
	}
	public double calculateSalary()
	{
		System.out.print("salary pf salaried employee=");
		return (getSalEmployee_salary()+getSalEmployee_bonus());
		
	}
} 
