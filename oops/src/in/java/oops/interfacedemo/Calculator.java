package in.java.oops.interfacedemo;
//functional interface
public interface Calculator {
//in interface only create final static public method 
	public final static int VAR=100;//inst var always public static final
	//single abstract method(SAM) - functional interface
	 public abstract int calculate(int number1 , int number2);//use for hide implementaion and shoe only important details
	 
	 public default void printMessage(String message) {
		 printMyMessage(message);//by default override 
		 
	 }
	 private void printMyMessage(String message) {
		 System.out.println(message);
	 }
	 public static void printVar() {
		 System.out.println(VAR);
	 }
}
