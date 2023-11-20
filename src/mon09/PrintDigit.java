package mon09;

import java.util.Scanner;

//Write a program to print digits of a number from Most significant digit to least using recursion.
//Get a number from the user and print it's digits from MSD to LSD. Digits will be separated by a
//newline.
//Sample Input:
//123
//Sample Output:
//1
//2
//3

public class PrintDigit {

	  public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int number = sc.nextInt();
	        printDigits(number);
	    }
	 
	    public static void printDigits(int num) {
	        if (num < 10) { 
	            System.out.println(num); 
	        } else {
	            int divisor = 1; 
	            while (num / divisor >= 10) {  
	                divisor *= 10; 
	            } 

	            int mostSignificantDigit = num / divisor;  
	            System.out.print(mostSignificantDigit); 
	            printDigits(num % divisor);  
	        }
	    }
}
