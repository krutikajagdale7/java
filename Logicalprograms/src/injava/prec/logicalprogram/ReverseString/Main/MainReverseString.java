package injava.prec.logicalprogram.ReverseString.Main;

import java.util.Scanner;

import injava.prec.logicalprogram.ReverseString.ReverseString;

public class MainReverseString {
 public static void main(String[] args) {
	ReverseString reverseString=new ReverseString();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Name to reverse:");
	String temp=scanner.nextLine();
	//reverseString.setVariable("krutika");
	reverseString.setVariable(temp);
	//String result = reverseString.reverseString();
	String result = reverseString.reverseStringLine();
	System.out.println(result);
	scanner.close();
}
}
