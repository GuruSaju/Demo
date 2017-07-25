package guru.solution.medium;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function PrimeTime(num) take the num parameter being passed and 
 * return the string true if the parameter is a prime number, otherwise return 
 * the string false. The range will be between 1 and 2^16.
 */
public class PrimeTrue {
	 public static String PrimeTime(int num) {
	      String result="true";
	    for(int i=2;i<num/2;i++){
	        if(num%i==0){
	            result="false";
	            break;
	        }
	       
	    }

	    return result;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(PrimeTime(Integer.parseInt(s.nextLine()))); 
	  }   
	  
	}