package com.inheritance;

import java.util.Scanner;

public class PersonalLoan extends Loan {
	void getPersonalLoanDocDetails(){
		System.out.println("your personal loan details are successfully submitted");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		//1) we can access data functionalities from both parent class and 
		//child class using child class object and child class reference
		
		Ln1 pl=new PersonalLoan();
		PersonalLoan p=new PersonalLoan();
		
		//2)we can access only parent class data functionalities using 
		//parent class object and parent class reference
		//Loan l=new Loan();
		
		
		//3)using child class object and parent class reference
		//we can access only parent class data functionalities and override methods
		//from parent to child.
	    // Loan l=new PersonalLoan();
		
		
		//4)can we access data functionalities using parent class object and
	    //child class reference..? NO
		//PersonalLoan pl=new Loan();
				
		
		double empsal=pl.getSalary();
		double empcibil=pl.getCibilScore();
		double empage=pl.getAge();
		if(empsal>=800000.00 && empcibil>=750 &&empage>22) {
			System.out.println("congratulations,your loan is approved");
			System.out.println("your RateOfInterest is :"+pl.loanRateOfInterset());
			System.out.println("enter your address for verification:");
			System.out.println("Address Info:");
			System.out.println(pl.getAddress());
		    p.getPersonalLoanDocDetails();	
			
		}else {
			System.out.println("sorry,your loan got rejected");
		}

	}

	

}
