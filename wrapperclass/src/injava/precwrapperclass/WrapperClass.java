package injava.precwrapperclass;

public class WrapperClass {
public static void main(String[] args) {
	//depricate from SE version 9
	//Integer var1 = new Integer(10);//depricate method means this method are remove in next version
	
	//boxing
	Integer var2=Integer.valueOf(20);//wrapper class
	//valueof() fun are used for boxed into object and assign to var
	
	//unboxing
	int var3 = var2.intValue();
	
	System.out.println(var2);
	
	int var01=10;
	
	  Integer var4 =01;
	  
	  int var5=var4;
//	  constant Max_VALUE and MIN_VALUE
	System.out.println(Integer.MAX_VALUE);  
	System.out.println(Integer.MIN_VALUE);
//	parsing
//  parseXxx this is present in all numeric class like parseint, parsedouble, parselong etc..
	int parseResult=Integer.parseInt("10110");
//	parseXxx(static method)
	float parseFloatresult=Float.parseFloat("12.50");
	
//	xxxValue
//	for conversion like int to float for that comman mehtod is Xxx 
	
	int valueresult=var4.intValue();
	float valueResult=var4.floatValue();
//  like wise for all data type for work to numeric not for char and 
	
	Float floatVar = 10.20F;
	
	int floatIntVlaueResult=floatVar.intValue();
	
	
	//toString
	
	//tostring methosd used for num convert into string
	
	String floatToStringResult = floatVar.toString();
	// 	num print in binary used tiBinaryString() mehtod
	
	Byte byteVar = 10;
	
	System.out.println(Integer.toBinaryString(byteVar));
	
//	isChar isNum

	
	Character ch = 'A';
	
//	 Charatcer (isAlphabet isDigit)
	boolean isAlphabet = Character.isAlphabetic(ch);
	boolean isDigit=Character.isDigit(ch);
	
}
}
