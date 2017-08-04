package guru.solution.medium;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor. 
 * That is, return the greatest number that evenly goes into both numbers with no remainder. For example: 12 and 16 
 * both are divisible by 1, 2, and 4 so the output should be 4. The range for both parameters will be from 1 to 10^3. 
 */
public class GreatestCommonDivision {
	
	public static int Division(int num1, int num2) { 

	        int smallest = num1>=num2 ? num2 : num1;
	    int largest = num1>=num2 ? num1 : num2;
	    int gcd=1;
	    if(largest%smallest==0){
	        gcd=smallest;
	    }
	    else{
	    for(int i=2;i<=smallest/2;i++){
	        if(num1%i==0 && num2%i==0){
	            gcd=i;
	        }
	    }   
	    }
	    return gcd;
	    
	  }    
	    
	  public static void main (String[] args) {  
	    System.out.print(Division(60,3)); 
	  } 
}
