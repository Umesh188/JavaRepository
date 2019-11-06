package com.demo.services;
import com.demo.beans.SalariedEmp;
import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import java.util.Scanner;
public class EmployeeServices
{
	public static void addSal_Employee(Employee[] arr,int cnt)
	{
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the name of employee");
		String nm=sc.next();
		System.out.println("Enter the mobile number of employee");
		int mob=sc.nextInt();
		System.out.println("Enter the department of employee");
		String dept=sc.next();
		System.out.println("Enter the designation of employee");
		String desg=sc.next();
		System.out.println("Enter the salary of employee");
		double sal=sc.nextDouble();
		System.out.println("Enter the bonus of employee");
		double bonus=sc.nextDouble();
		arr[cnt]=new SalariedEmp(nm,mob,dept,desg,sal,bonus,cnt);	
	}

	public static void addCont_Employee(Employee[] arr,int cnt)
	{
		Scanner sc1= new Scanner(System.in); 
		System.out.println("Enter the name of employee");
		String nm=sc1.next();
		System.out.println("Enter the mobile number of employee");
		int mob=sc1.nextInt();
		System.out.println("Enter the department of employee");
		String dept=sc1.next();
		System.out.println("Enter the designation of employee");
		String desg=sc1.next();
		System.err.println("Enter the daily charges of employee");
		double sal=sc1.nextDouble();
		System.out.println("Enter the no of days of employee");
		int ds=sc1.nextInt();
		arr[cnt]=new ContractEmp(nm,mob,dept,desg,ds,sal,cnt);	
	}

	public static int search(Employee[] arr,int cnt,String nm)
	{
		
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getPerson_Name().equals(nm))
			{
				return i;
			}
			
		}
		return -1;
	}


}
 

