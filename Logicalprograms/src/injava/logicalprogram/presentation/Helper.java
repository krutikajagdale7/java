package injava.logicalprogram.presentation;

import java.util.Scanner;//ctrl+shift+o

import injava.logicalprogram.armstrongnumber.ArmstrongNumber;
import injava.logicalprogram.perfectnumber.PerfectNumber;
import injava.logicalprogram.primenumber.PrimeNumber;

public class Helper {
//for print menu
	public int printMenu(Scanner scanner) {
		
		//System.out.println("1. to check if no is Palindrome");
		System.out.println("1. to check if no is Armstrong");
		System.out.println("2. to check if no is Perfect");
		System.out.println("3. to check if no is Prime");
		System.out.println("0. To Exit..");
		return scanner.nextInt();
	}
//	public void checkPallindromeNumber(Scanner scanner) {
//		ReverseNumber number = new ReverseNumber();
//		System.out.println("Enter a number:");
//		int variable =scanner.nextInt();
//	    number.setNumber(variable);
//	    if(number.checkdForPallinderomeNumber())
//	    	System.out.println(variable +"is pall ");
//	    else
//	    	System.out.println(variable +"is not pall ");
//	}
	public void checkArmstrongNumber(Scanner scanner) {
		ArmstrongNumber number = new ArmstrongNumber();
		System.out.println("Enter a number:");
		int variable =scanner.nextInt();
	    number.setNumber(variable);
	    if(number.isArmstrongNumber())
	    	System.out.println(variable +"is armstrong ");
	    else
	    	System.out.println(variable +"is not armstrong ");
	}
	public void checkPerfectNumber(Scanner scanner) {
		PerfectNumber number = new PerfectNumber();
		System.out.println("Enter a number:");
		int variable =scanner.nextInt();
	    number.setNumber(variable);
	    if(number.isPerfectNumber())
	    	System.out.println(variable +"is PerfectNumber");
	    else
	    	System.out.println(variable +"is not PerfectNumber ");
	}
	
	public void checkPrimeNumber(Scanner scanner) {
		PrimeNumber number = new PrimeNumber();
		System.out.println("Enter a number:");
		int variable =scanner.nextInt();
	    number.setNumber(variable);
	    if(number.isPrime())
	    	System.out.println(variable +"is PrimeNumber");
	    else
	    	System.out.println(variable +"is not PrimeNumber ");
	}
}
