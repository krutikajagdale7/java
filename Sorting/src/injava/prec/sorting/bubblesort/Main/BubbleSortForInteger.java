package injava.prec.sorting.bubblesort.Main;

public class BubbleSortForInteger {

	int[] arr;

	public BubbleSortForInteger() {}

	public BubbleSortForInteger(int[] arr) {
		this.arr = arr;
}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int[] getArr() {
		return arr;
	}
	public void bubbleSort() {
    	
    	for(int i=0;i<arr.length-1;i++) {
    		for(int j=0;j<arr.length-i-1;j++) 
    			if (arr[j] > arr[j + 1]){
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    				}
    	
    	for(int number:arr) {
    		System.out.print(number+" ");}
    	System.out.println();
    	
    	}
    	}
}
