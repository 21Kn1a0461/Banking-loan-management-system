package com.inheritance;

import java.util.Scanner;

public class HouseLoan extends Loan {
	
	
	void getHouseLoanDocDetails() {
		System.out.println("your house loan documents are successfully submitted");
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Ln1 hl=new HouseLoan ();
		HouseLoan h=new HouseLoan();
		
		double empSal=hl.getSalary();
		double empCibilScore=hl.getCibilScore();
		double empAge=hl.getAge();
		if(empSal>=600000.00 && empCibilScore>=600 && empAge>22) {
			System.out.println("congratulations,your home loan is approved");
			System.out.println("your rateOfInterest is:"+ hl.loanRateOfInterset());
			System.out.println("enter your address for verification");
			System.out.println("Address Info:");
			System.out.println(hl.getAddress());
			h.getHouseLoanDocDetails();
		}
		else {
			System.out.println("sorry,your loan got rejected");
		}

	}

}
