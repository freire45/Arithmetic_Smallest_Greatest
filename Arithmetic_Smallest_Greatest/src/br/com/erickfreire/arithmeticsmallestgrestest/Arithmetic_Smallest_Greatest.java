package br.com.erickfreire.arithmeticsmallestgrestest;

import java.util.Scanner;

public class Arithmetic_Smallest_Greatest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int number1;
	    int number2;
	    int number3;
	    
	    System.out.println("Java program that calculates Arithmetic, Smallest and Greatest value: ");
	    System.out.print("Enter the first value: ");
	    number1 = input.nextInt();
	    
	    System.out.print("Enter the second value: ");
	    number2 = input.nextInt();
	    
	    System.out.print("Enter the third value: ");
	    number3 = input.nextInt();
	    
	    System.out.printf("Sum: %d%n", number1 + number2 + number3);
	    System.out.printf("Average: %d%n", ((number1 + number2 + number3)/3));
	    System.out.printf("Product: %d%n", number1 * number2 * number3);
	    
	    if(number1 > number2)
	    	if(number1 > number3)
	    		System.out.printf("The Greatest value is: %d%n", number1);
	    
	    if(number2 > number1)
	    	if(number2 > number3)
	    		System.out.printf("The Greatest value is: %d%n", number2);
	    
	    if(number3 > number1)
	    	if(number3 > number2)
	    		System.out.printf("The Greatest value is: %d%n", number3);
	    
	    if(number1 < number2)
	    	if(number1 < number3)
	    		System.out.printf("The Smallest value is: %d%n", number1);
	    
	    if(number2 < number1)
	    	if(number2 < number3)
	    		System.out.printf("The Smallest value is: %d%n", number2);
	    
	    if(number3 < number1)
	    	if(number3 < number2)
	    		System.out.printf("The Smallest value is: %d%n", number3);


	}

}
