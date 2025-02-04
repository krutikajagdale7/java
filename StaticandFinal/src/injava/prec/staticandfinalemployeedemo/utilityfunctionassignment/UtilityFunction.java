package injava.prec.staticandfinalemployeedemo.utilityfunctionassignment;

public class UtilityFunction {

	public static double power(double base , double exponent) {
		int i=1;
		int pow=1;
		while(i<=exponent) {
			pow*=base;
			i++;
		}
		return pow;
	}

	public static double sum(double no1 , double no2) {
		double summation = no1+no2;
		return summation ;
	}
	public static double mult(double no1 , double no2) {
		double multiplication = no1*no2;
		return multiplication ;
	}
	public static double divde(double no1 , double no2) {
		double  divide = no1/no2;
		return  divide;
	}
}
