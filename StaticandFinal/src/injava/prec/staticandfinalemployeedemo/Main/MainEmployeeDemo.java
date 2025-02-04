package injava.prec.staticandfinalemployeedemo.Main;

import injava.prec.staticandfinalemployeedemo.EmplyoeeDemo;

public class MainEmployeeDemo {
public static void main(String[] args) {
	
	EmplyoeeDemo.setOraganizationName("Apple");
	
	EmplyoeeDemo employee1 = new EmplyoeeDemo("Abc",30000F,50);
	EmplyoeeDemo employee2 = new EmplyoeeDemo("KBJ",40000F,51);
	EmplyoeeDemo employee3 = new EmplyoeeDemo("Abc",60000F,53);
	EmplyoeeDemo employee4 = new EmplyoeeDemo("Abc",30000F,52);
	EmplyoeeDemo employee5 = new EmplyoeeDemo("Abc",20000F,50);
	System.out.println(employee1);
	System.out.println(employee2);
	System.out.println(employee3);
	System.out.println(employee4);
	System.out.println(employee5);
	
	
	
	
	EmplyoeeDemo.setOraganizationName("Microsoft");
	
	System.out.println(employee1);
	System.out.println(employee2);
	System.out.println(employee3);
	System.out.println(employee4);
	System.out.println(employee5);
}
}
