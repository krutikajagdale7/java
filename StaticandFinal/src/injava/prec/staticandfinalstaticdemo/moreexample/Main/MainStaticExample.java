package injava.prec.staticandfinalstaticdemo.moreexample.Main;

import injava.prec.staticandfinalstaticdemo.moreexample.StaticExample;

public class MainStaticExample {
	int variable;
	static {
		System.out.println("Static Block");
	}
	public void printHello() {
		System.out.println("hello");
		System.out.println(variable);
		//main("ABC","KBJ");
	}
public static void main(String...args) {
	
	//StaticExample.printData();//calss name thr we can access the methid no create object
	MainStaticExample example = new MainStaticExample();
	StaticExample.demo.printVariable();
	example.printHello();
	System.out.println(example.variable);
}
}
