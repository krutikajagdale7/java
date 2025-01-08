package injava.prec.logicalprogram.ReverseString;

public class ReverseString {
	String variable; 
		public ReverseString() {}
		public ReverseString(String variable) {
			this.variable = variable;
		}
		public void setVariable(String variable) {
			this.variable = variable;
		}
		public String getVariable() {
			return variable;
		}
		public String reverseString() {
			char[] charArray=variable.toCharArray();//call char array
			int left=0;//index define
			int right = charArray.length-1;//last index
			while(left<=right) {    //1st ele swap with last ele  left++,right--
				char temp=charArray[left];//one array take that is temp
				charArray[left]=charArray[right];
				charArray[right]=temp;
				left++;
				right--;
			}
			//for char array written as string 
			
			return new String(charArray);//for invoke constructor use new 
		}
		public String reverseStringLine() {
			String[] stringArray=variable.split(" ");//split address using split method
			int left=0;
			int right = stringArray.length-1;
			while(left<=right) {
				String temp= stringArray[left];
				stringArray[left]=stringArray[right];
				stringArray[right]=temp;
				left++;
				right--;
			}
			//String result = String.join(" ", stringArray);//class name use here 
			//return result;//insted of creating new variable we directly use return
			return String.join(" ", stringArray);
		}
	}


