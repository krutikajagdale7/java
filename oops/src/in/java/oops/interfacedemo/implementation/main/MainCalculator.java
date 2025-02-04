package in.java.oops.interfacedemo.implementation.main;

import in.java.oops.interfacedemo.Calculator;
import in.java.oops.interfacedemo.implementation.AddCalculation;
import in.java.oops.interfacedemo.implementation.DivdeCalculation;
import in.java.oops.interfacedemo.implementation.SubtractionCalculation;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator addcalc= new AddCalculation();
	
				addcalc.printMessage("J122");
				addcalc.printMessage(addcalc.calculate(10,20)+"");
				Calculator subcalc= new SubtractionCalculation();
				subcalc.printMessage("J113");
				subcalc.printMessage(subcalc.calculate(30,20)+"");
				
				Calculator divcalc= new DivdeCalculation();
				addcalc.printMessage("here done division");
				divcalc.printMessage(divcalc.calculate(10, 12)+"");
				
				//Calculator mulCalc = new Calculator() {
					//@Override
					//anamypos class
					//use in only one time case
					//define interface object
//					public int calculate(int munber1 , int number2) {
//						//return number2*number2;//method here is no have any name for class thisis call ananomyous class
//					}
//				};
//					
//				//mulCalc.printMessage(mulCalc.calculate(5, 4)+"");
//				
				//remove unnecessary syntax use lambda expression
					//in interface having single abstract method
				//is functional interface is present in code then and then lambda fun is worked
					Calculator mulCalc = (number1 , number2)->number1*number2;//single statement then not use curly braces
					//here not accsess modifier
					mulCalc.printMessage(mulCalc.calculate(5, 4)+"");
					Calculator divCalc = (n1 , n2)->n1/n2;
					divCalc.printMessage(divCalc.calculate(4 ,2)+"");
					
					Calculator leftShiftCalc = (n1,n2)->n1<<n2;//10<<2  shortcut is 10*2^2=40, for leftshift = multiply , for rightshift = division 
		            leftShiftCalc.printMessage(leftShiftCalc.calculate(10, 2)+"");
	}
	
	
}
