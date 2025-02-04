package injava.prec.InsertionSort;

public class InsertionSortForInteger {

	
	int[] arr;

	public InsertionSortForInteger() {}

	public InsertionSortForInteger(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public void insertionSort() {
		int key;
		int j;
		for(int i=0;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
		}
	}
		
	}
	



