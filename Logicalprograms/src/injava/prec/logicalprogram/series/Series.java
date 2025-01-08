package injava.prec.logicalprogram.series;

public class Series {
int limit;
public Series() {
	
}
public Series (int limit) {
	this.limit=limit;
	
}
public void setLimit(int limit) {
	this.limit=limit;
}
public int getLimit() {
	return limit;
	
}
public void printFibonacciSeries() {
	int number1=0;
	int number2=1;
	System.out.print("0 + 1");
	int sum=0;
	for(int i=0;i<limit-2;i++) {
		sum=number1+number2;
		System.out.print(" + "+sum +" ");
		number1=number2;
		number2=sum;
	}
	}
public void printCubeSquareSeries() {
	for(int i=1; i<limit;i++)
		if(i%2==0)
			System.out.print(i*i + " ");
		else
			System.out.print(i*i*i + " ");
}
 public void printCubeSeries() {
	 
 
        int n1=1; 

        for (int i = 0; i < limit; i++) {
            if (i%2==0) {
                System.out.print(n1 + " ");
                n1=n1+4;// Print 5 at 2nd and 4th positions
            }
            else {
            	System.out.print(n1+" ");
            	n1=n1-2;
            }
            

}
 }
 public void printCharSeries() {
	 char ch='A';
	 for(int i=0;i<limit;i++) {
		 if(i%2==0) {
			 System.out.println(ch + " ");
			 ch+=4;
			 
		 }
		 else {
			 System.out.println(ch + " ");
			 ch-=2;
		 }
	 }
 }

}
