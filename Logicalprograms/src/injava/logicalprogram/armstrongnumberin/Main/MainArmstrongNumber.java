package injava.logicalprogram.armstrongnumberin.Main;

import java.util.Scanner;

import injava.logicalprogram.armstrongnumber.ArmstrongNumber;

public class MainArmstrongNumber {
	public static void main(String[]args) {
		ArmstrongNumber number = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);//obj - sys.in open string to acces continus data from keyboard
//		System.out.println("Enter Integer Value :1");
//		int variable=scanner.nextInt();//nextFloat . boolean , for charator onle use next, for string next and for long laine is nextline
//		//number.setNumber(variable);
//		//int var=153;
//		number.setNumber(variable);
//		if(number.isArmstrongNumber())
//			System.out.println(variable + " is a Armstrong Number");
//		else
//			System.out.println(variable+ " is not Armstrong Number");
//		scanner.close();
		System.out.println("Enter in value:");
		int variable=scanner.nextInt();
		
		System.out.println("Enter Address:");
		scanner.nextLine();
		String address = scanner.nextLine();
		scanner.close();
		
	}

}
