package injava.logicalprogram.perfectnumber.Main;

import java.util.Scanner;

import injava.logicalprogram.perfectnumber.PerfectNumber;

public class MainPerfectNumber {
	
	public static void main(String[]args) {
		PerfectNumber number = new PerfectNumber();
		Scanner scanner = new Scanner(System.in);
		number.setNumber(0);
		System.out.println("enter a number:");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if( number.isPerfectNumber())
			System.out.println(variable + " is a Perfect number");
		else
			System.out.println(variable + " is not a Perfect number");
			
	}

}
