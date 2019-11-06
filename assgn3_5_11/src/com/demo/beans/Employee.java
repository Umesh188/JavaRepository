package com.demo.beans;
import com.demo.beans.*;
public class Employee extends Person
{
	
	private  int id=0;
	private String dept;
	private String desg;
	
	public  Employee(String name,int mobile,String dept,String desg,int cnt)
	{


		super(name,mobile);	
	
		this.dept=dept;
		this.desg=desg;
		this.id=cnt+1;
		System.out.println("in Employee constructor dept is="+dept+" designation= "+desg);	

	}

	
		
	public String getEmployee_dept()
	{
		return dept;
	} 
	public void setEmployee_dept(String dept)
	{
		this.dept=dept;
	}

	public String getEmployee_desg()
	{
		return desg;
	} 
	public void setEmployee_desg(String desg)
	{
		this.desg=desg;
	}
	public int getEmployee_id()
	{
		return id;
	} 
	public void getEmployee_id(int id)
	{
		this.id=id;
	}
	public String toString()
	{
		
		return super.toString()+"id is = "+id+"\ndepartment is = "+this.dept+"\nDesignation = "+this.desg;
	}
	 public  double calculateSalary() {
		 return 0.0;
	 }

} 
