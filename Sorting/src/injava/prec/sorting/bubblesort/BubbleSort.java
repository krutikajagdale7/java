package injava.prec.sorting.bubblesort;

public class BubbleSort {
String[] stringArray;

public BubbleSort() {
	
}
public BubbleSort(String[]stringArray) {
	this.stringArray = stringArray;
	
}
	
public String[] getStringArray() {
	return stringArray;
}
public void setStringArray(String[] stringArray) {
	this.stringArray= stringArray;
	
}
public void bubbleSort() {
	int flag;
	for(int i=0; i<stringArray.length-1;i++) {
		flag=0;
		for(int j = 0;j<stringArray.length-i-1;j++) {
			String temp=stringArray[j];
			stringArray[j]=stringArray[j+1];
			stringArray[j+1]=stringArray[j+1];
			stringArray[j+1]=temp;
			flag=1;
			
		}
		for(String name:stringArray)
			System.out.println(name+" ");
		if(flag==0)
			break;
	}
}
}
