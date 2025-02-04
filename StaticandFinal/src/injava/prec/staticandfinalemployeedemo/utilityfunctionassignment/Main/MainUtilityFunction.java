package injava.prec.staticandfinalemployeedemo.utilityfunctionassignment.Main;

import injava.prec.staticandfinalemployeedemo.utilityfunctionassignment.UtilityFunction;

public class MainUtilityFunction {
public static void main(String[] args) {
	double base=2;
	double exponent=3;
	double result = UtilityFunction.power(base, exponent);
//	double no1=3;
//	double no2=5;
	double sum = UtilityFunction.sum(3,5);
//	UtilityFunction utility = new UtilityFunction();
//	double result = utility.power(2,3);
	System.out.println(result);
	System.out.println(sum);
	double mult = UtilityFunction.mult(3,5);
	System.out.println(mult);
	double divide = UtilityFunction.divde(3, 5);
	System.out.println(divide);
	
	
	
}

}
