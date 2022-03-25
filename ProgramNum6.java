// write program that returns the average of the sum of all 
//numbers from 1 to 
// from 1 to n


//Joshua Nunoo
import java.util.Scanner;
public class ProgramNum6 

{
	
	
	public static void averageNum (  ) {
		
	Scanner scnr= new Scanner (System.in);
		

	double n = scnr.nextDouble();
	double i;
		for (i = 1; i <= n; i+=n) {
			
			double average= ( n *(n +1) /2);
			
			System.out.println(average);
		}
		
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		averageNum();

	}
	
	
	
	

}
