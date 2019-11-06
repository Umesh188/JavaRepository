package com.demo.beans;
public class Person
{
	
	private String name;
	private int mobile;
	
	public Person()
	{
		this.name=null;
		this.mobile=0;	

	}

	public Person(String name,int pg)
	{
		System.out.println("in person constructor");
		this.name=name;
		this.mobile=pg;

	}

	
		
	public String getPerson_Name()
	{
		return name;
	} 
	public void setPerson_Name(String nm)
	{
		this.name=nm;
	}

	public int getMobile()
	{
		return mobile;
	} 
	public void setMobile(int mobile)
	{
		this.mobile=mobile;
	}
	public String toString()
	{
		return "name is = "+name+"\nmobile number = "+mobile;
	}


} 
