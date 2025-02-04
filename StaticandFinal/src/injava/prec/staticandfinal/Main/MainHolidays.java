package injava.prec.staticandfinal.Main;///This is A part main  part 

import injava.prec.staticandfinal.Holidays;

public class MainHolidays {
	public static void main(String[] args) {
		Holidays diwali = new Holidays("Diwali",5);
		Holidays dasra = new Holidays("Dasra",1);
		
		System.out.println(diwali);//System.out.println(diwali.toString());
		
		System.out.println(dasra);//System.out.println(dasra.toString());
	}
	

}
