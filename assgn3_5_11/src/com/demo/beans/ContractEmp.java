package com.demo.beans;
import com.demo.beans.*;
public class ContractEmp extends Employee
{
	
	private int no_of_days;
	private double daily_charges;
	
	
	public ContractEmp(String name,int mobile,String dept,String desg,int no_of_days,double daily_charges,int cnt)
	{
		super(name,mobile,dept,desg,cnt);
		this.no_of_days=no_of_days;
		this.daily_charges=daily_charges;
		
	}

	
		
	public int getEmployee_no_of_days()
	{
		return no_of_days;
	} 
	public void setEmployee_no_of_days(int no_of_days)
	{
		this.no_of_days=no_of_days;
	}

	public double getEmployee_daily_charges()
	{
		return daily_charges;
	} 
	public void setEmployee_daily_charges(double daily_charges)
	{
		this.daily_charges=daily_charges;
	}
	public String toString()
	{
	
		return 	super.toString()+"number of days = "+this.no_of_days+"\ndaily_charges = "+daily_charges;
	}
	
	public double calculateSalary()
	{
		return getEmployee_daily_charges()*getEmployee_no_of_days();
	}
} 
