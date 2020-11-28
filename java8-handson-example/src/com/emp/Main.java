package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);//Employee emp=new Employee();
		
		 int choice;
		 while(true) {
			
			 System.out.println("1.	Add");
				System.out.println("2: Display Id");
				System.out.println("3: Display All");
				System.out.println("4: Sort by id");
				System.out.println("5: Sort by dob");
				System.out.println("6: Sort by salary:");
				System.out.println("7: Sort by name ");
				System.out.println("8: Exit");
				 System.out.println("please choose option");
		 choice =sc.nextInt();
			
		System.out.println(choice);
		
		if(choice==1) {
			addEmployee();
			}
		if(choice==2) {
			findbyid();
			}
		
	   if(choice==3) {
	  	displayall();
	   }
	   if(choice==4) {
		   sortbyid();
	   }
	   if(choice==5) {
		   sortbydob();
	   }
	   if(choice==6) {
		   sortbysalary();
	   }
	   if(choice==7) {
		   sortbyname();
	   }
	   if(choice==8) {
		   break;
	   }
		 }
	      
	}




	




	static ArrayList<Employee> list = new ArrayList<Employee> ();
      
	//AddEMployee method Implementation
	private static void addEmployee() {
	
		 
		  Scanner sc=new Scanner(System.in);
		  int id;
			String name;
			String dob;
				 long salary;
				 String status = null;

		 System.out.println("Enter Employee id:");
		    id = sc.nextInt();
		System.out.println("enter employee name:");
		 name=sc.next();
		 System.out.println("enter employee dob");
		 dob=sc.next();
	      System.out.println("enter employee salary");
	      salary=sc.nextLong();	      
	   
	      Employee c = new Employee ();


	      c.setId(id);;
	      c.setName(name);
	      c.setDob(dob);
	      c.setSalary(salary);
	      list.add(c);
	      System.out.println("continuee y/n");


        System.out.println("Records inserted successfully");
        
        //System.out.println("conitine or not y/n");
        status=sc.next();
        while(status=="n") {
        	addEmployee();
        }
        }
	  
	//Display all details implementation
	private static void displayall() {
		 Employee c = new Employee ();
		 for(Employee d:list) {
			   System.out.println(d);
		  }
		
		
	}
	
	//find by id
	private static void findbyid() {
		 Employee c = new Employee ();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the id which you want to find");
		 int fid=sc.nextInt();
		 for(Employee d:list) {
			 if(d.getId()==fid )
			   System.out.println(d);
		  }
		
	}
	
	//sortbyid mehod
	private static void sortbyid() {
		// Employee c = new Employee ();
		 
		//Collections.sort(list,(e1,e2 )-> e1.getId().compareTo(e2.getId()));
		Collections.sort(list,new Comparator<Employee>(){
			public int compare(Employee e1,Employee e2) {
				return e1.getId()- e2.getId();
			}
		});
		list.forEach(e -> System.out.println(e));
	}

	//sort by salary
	private static void sortbysalary() {
		Collections.sort(list,(e1,e2) -> Long.compare(e1.getSalary(), e2.getSalary()));
		list.forEach(e -> System.out.println(e));
		
	}
	
	//sort by name
	private static void sortbyname() {
	   Collections.sort(list,(e1,e2) -> e1.getName().compareTo(e2.getName()));
		list.forEach(e -> System.out.println(e));
		
	}
	
	//sort by dob
	private static void sortbydob() {
		 Collections.sort(list,(e1,e2) -> e1.getDob().compareTo(e2.getDob()));
			list.forEach(e -> System.out.println(e));
		
	}


}

		
		
	

	

	
	


