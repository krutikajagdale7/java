package injava.prec.staticandfinal;

public final class Holidays {
	
	final String festival;//create paramertrized constructor for final 
	final int noOfLeaves;//in capital we can present ithe final variable
	
	
	  public Holidays(String festival , int noOfLeaves) { 
		  this.festival=festival;
	      this.noOfLeaves=noOfLeaves; 
	      }
	 
	
	public final String getFestival() {
		return festival;
		
	}
	public int getNoOfLeaves(final float PI) {
		final int variable=100;
		
		return noOfLeaves;//this is heap part that means b part
	}
	@Override
	
	public String toString() {
		return "Festival:" + festival + "no Of Leaves:"+ noOfLeaves;
	}
	

}
