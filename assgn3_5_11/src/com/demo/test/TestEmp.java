package com.demo.test;
import com.demo.beans.*;
import com.demo.services.EmployeeServices;
import com.demo.services.*;
import java.util.Scanner;
class TestEmp
{
	static int count=0;
	public static void main(String[] args)
	{
		
		int choice,ch1;
		Scanner sc=new Scanner(System.in);
		Employee[] arr=new Employee[10];
		
		do
		{
		System.out.println("1.Add Employee");
		System.out.println("2.Display Employee");
		System.out.println("3.Calculate Salary");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: 	
				System.out.println("1.Add salaried Employee");
				System.out.println("2.Add contract Employee");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:EmployeeServices.addSal_Employee(arr,count);
							count++;	
							break;
					case 2: EmployeeServices.addCont_Employee(arr,count);
							count++;
							break;
				}
		
					break;
			case 2:for(int i=0;i<count;i++)
				{
					System.out.println(arr[i]);
				}
				break;
				
			case 3:	System.out.println("1.calculate salary for Salaried emp");
					System.out.println("2.Add calculate salary for contract Employee");
					System.out.println("Enter your choice");
					int c=sc.nextInt();
					switch(c)
					{
						case 1:System.out.println("enter name of employee");
								String str=sc.next();
								int pos=EmployeeServices.search(arr, count, str);
								if(pos!=-1)
								{
									System.out.println(arr[pos].calculateSalary());
								}
								else
								{
									System.out.println("Employee not found");
								}
								break;
						case 2:System.out.println("enter name of employee");
								String str1=sc.next();
								int pos1=EmployeeServices.search(arr, count, str1);
								if(pos1!=-1)
								{
									System.out.println(arr[pos1].calculateSalary());
								}
								else
								{
									System.out.println("Employee not found");
								}
					
								break;
						default: System.out.println("Invalid choice");
					}
						break;
			case 4: System.exit(0);break;
			default: System.out.println("Invalid choice");break;
		}
	 	System.out.println("Do u want to continue(0/1)");
		ch1=sc.nextInt();
		}while(ch1!=0);


	}




}
