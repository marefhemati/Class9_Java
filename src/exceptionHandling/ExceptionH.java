package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionH {
//Interview Question: what's try and catch?
	//Try and catch help us to handle exceptions. The formula is: try{} catch(){} and we use it when we know that we may have exception. 
	// and try and catch allow the code to print the rest after exception like below:
	
	public static void main(String[] args) {
//		System.out.println("what's your age");
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt(); // here we as for int value if the user int String like five it with give an exception then we can use try and catch
//		System.out.println("You put invalid value");
		
		
// below we use try and catch, we put our code inside the try where we could make mistake
		try {System.out.println("what's your age");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		} catch(InputMismatchException c) {
			
			System.out.println("You put invalid value");
		}
			finally {
				System.out.println("Addd namuric value");
			}
			
//Interview Question: What does the finally block do?
//The finally block allows you to execute the finally block no matter the try and catch happen or not the finally block will be execute.
			
		}
//or Interview Question my be like this: what all the finals,( final, finally and finalize) do in java?
//Final: if we use final in variable we can not change the variable value and if we use final within a method we can not change it or override it and if 
// if we use final with class we can not inherit that class.
//Finally: The finally block allows us to execute the finally block no matter the try and catch happen or not the finally block will be execute.
//Finalize: finalize is garbege collector 
	
	}


