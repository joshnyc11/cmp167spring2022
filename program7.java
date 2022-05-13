package week7;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 double [] balances = new double [] { 2.56, 12.57, 36.57, 57.89 };
	 
	 double total = 0.0;
	 
	 for ( int i =0; i < balances.length; i++) {
		 
		 total += balances [i];

	}
	 
	 
	 double average = 0.0;
	 
	 for  (int i =0; i < balances.length; i++) {
		 
		 
		 total += balances[i];
		 
		 average = total/balances.length;

	}

	 
	 
	 System.out.println("Total Balance: " + total);
	 System.out.println("Average:" + average);
	

}
	
	
}
