package injava.prec.staticandfinalstaticdemo.moreexample;

import injava.prec.staticandfinalstaticdemo.StaticDemo;

public class StaticExample {
	public static StaticDemo demo;//accsses modifer modifier obj demo
	
//	public StaticExample() {
//		
//		demo = new StaticDemo();
	//}
	static {
		demo=new StaticDemo();
	}

	public static void printData() {
		demo.printVariable();
	}
}
