package injava.prec.sorting.selection;

public class SelectionSortForInteger {

	int[] arr;

	public SelectionSortForInteger() {}

	public SelectionSortForInteger(int[] arr) {
		this.arr = arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public int[] getArr() {
		return arr;
	}

	public void selectionSort() {
    	int key;
    	int temp;
    	
    	for(int i=0;i<arr.length-1;i++) {
    	  key=i;
    	  for(int j=i+1;j<arr.length;j++) 
    		  if(arr[key]<arr[key])
    			  key=j;
    	
    	  temp=arr[i];
    	  arr[i]=arr[key];
    	  arr[key]=temp;
    	  
    	}
	

}
	}


