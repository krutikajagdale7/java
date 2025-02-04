package injava.prec.String;

public class StringClassDemo {
 public static void main(String[] args) {
//	String name = "ABC";//string constant or string literal
//	String name = new String();
//	String name = new String("ABC");
	char[]chArray = {'a','b','c'};
	String name = new String();
	int length = name.length();
	char ch = name.charAt(0);//written array value and store in char array
	name.replace('a','z');
	String result=name.replace('a','z');
	System.out.println(result);
	String newResult= result.replace("zb", "a");
	System.out.println(newResult);
	
	newResult.concat(result);
	
	String finalResult=newResult.concat(result);
	System.out.println(finalResult);
	boolean isContains=finalResult.contains("zzc");
	System.out.println(isContains);
	
	String subString1 = finalResult.substring(4);
	String subString2 = finalResult.substring(0,4);
	
	String[] splitResult=finalResult.split("z");
	String joinResult=String.join(" ",splitResult);//output ac bcz
	System.out.println(joinResult);
//	String joinResult=String.join(",",splitResult);//output ac, bcz
//	System.out.println(joinResult);
	boolean matchResult=joinResult.matches("[a-z]:[a-z]+");
	System.out.println(matchResult);//if match is trueotherwise is false
	
	char[] charArray=joinResult.toCharArray();//convert string into char then use tocharArray method
	String name2 = new String("ABC").intern();//result is true
	String name1 ='ABC';
	
	System.out.println(name1 == name2);
	
	
}
}
