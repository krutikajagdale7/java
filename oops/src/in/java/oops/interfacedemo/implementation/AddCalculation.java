package in.java.oops.interfacedemo.implementation;

import in.java.oops.interfacedemo.Calculator;

public class AddCalculation implements Calculator {
	
//this calss provide implementation of 
	public int calculate(int number1, int number2) {
		return number1+number2;
	}
}
//multiply,sub,divide
// class SubtractCalculation implements Calculator {
//	 public int calculate(int number1, int number2) {
//		 return number1 - number2;
//	 }
// }