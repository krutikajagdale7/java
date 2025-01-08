package injava.logicalprogram.primenumber.Main;



import java.util.Scanner;

import injava.logicalprogram.primenumber.PrimeNumber;

public class MainPrimeNumber {

	public static void main(String[]args) {
		PrimeNumber number = new PrimeNumber();
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a in number:");
//		int variable =scanner.nextInt();
		for(int i=2;i<100;i++) {
			number.setNumber(i);
			if(number.isPrime())
				System.out.println(i+ "is a prime number");
			//else
				//System.out.println(i + "is not a prime number");
		}
	}
}
		
//		number.setNumber(variable);
//		if(number.isPrime())
//			System.out.println(variable + "is a prime number");
//		else
//			System.out.println(variable + "is not a prime number");
//		
//	}
//}

