package injava.prec.String;

public class StringBuilderClassDemo {
	public static void main(String[] args) {
		//StringBuilder sb="";
		//StringBuilder stringBuilder = new StringBuilder();
		 //StringBuilder stringBuilder = new StringBuilder("ABC");
		 StringBuilder stringBuilder = new StringBuilder();//obj//here not create new obj done change in already present obj
		 stringBuilder.append("12345");
		 System.out.println(stringBuilder.capacity());
		 
		 int length = stringBuilder.length();
		 
		// stringBuilder.deleteCharAt(0);
		 stringBuilder.delete(1, 3);
		 
		 
		 System.out.println(stringBuilder.toString());
		 
		 stringBuilder.setCharAt(2, (char)67);
		 System.out.println(stringBuilder.toString());
		 
		 stringBuilder.replace(0, 2,"AB");
		 
		 System.out.println(stringBuilder);
		 
		 stringBuilder.reverse();
		 System.out.println(stringBuilder);
		 
		 char ch=stringBuilder.charAt(0);
		 
		 System.out.println(ch);
		 
		 int result=stringBuilder.compareTo(new StringBuilder("CBA"));
		 
		 System.out.println(result);
		 
		 //1st string is greater to 2nd no. then reuslt is Positive no.//vise versa
		 
//		 boolean equalResult = stringBuilder.equals(new stringBuilder("CBA"));//compare two obj, if 2obj have sAME memory address then true otherwise false 
//         System.out.println(equalResult);
         
         String stringResult = stringBuilder.toString();
         
         System.out.println(stringResult);
	}


}
