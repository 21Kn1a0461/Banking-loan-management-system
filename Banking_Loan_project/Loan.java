package com.inheritance;

import java.util.Scanner;

public class Loan implements Ln1 {
	
	static Scanner sc=new Scanner(System.in);

	@Override
	public int getSalary() {
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		return salary;
		
		
	}

	@Override
	public int getCibilScore() {
		System.out.println("enter the cibil score");
		int cibilscore=sc.nextInt();
		return cibilscore;
	}

	@Override
	public int getAge() {
		System.out.println("enter the age");
		int age=sc.nextInt();
		return age;
	}

	@Override
	public double loanRateOfInterset() {
		return 6.00;
	}

	@Override
	public String getAddress() {
       String address=" ";
		
		System.out.println("enter the flat number");
		int flat=sc.nextInt();
		
		System.out.println("enter the plot ");
		String plot=sc.next();
		
		System.out.println("enter the street");
		String street=sc.next();
		
		System.out.println("enter the city");
		String city=sc.next();
		
		System.out.println("enter the pincode");
		int pincode=sc.nextInt();
		
		address=("flatNumber:"+flat+",plot:"+plot+
				",street:"+street+",city:"+city +",pincode:"+pincode);
		return address;
	}
	
	
	
	
	

	
	
	
	
	

	

}
