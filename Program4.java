package week4;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 write a program that prompts the user for their age and decide whether gthey can drink or not
		 welcome the user
		 ask their age
		 wait for input
		 tell them if they can drink or not
		*/
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Welcome. Please enter your age.");
	
		int age = scnr.nextInt();
		
		if ( age >= 21 )
			
		{
			System.out.println("You are old enough to consume alcohol.");
			
			
		}
		
		else {
			
			System.out.println("You are not old enough to consume alcohol.");
		}
		}
		
		
		
		
	}

