package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num. For example: 
 * if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. 
 * For the test cases, the parameter num will be any number from 1 to 1000.
 */
public class SimpleAddition {

	  public static int SimpleAdding(int num) { 
	      int result=0;
	    for(int i=1;i<=num;i++){
	        result=result+i;
	    }
	       
	    return result;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(SimpleAdding(Integer.parseInt(s.nextLine()))); 
	  }   
	  
	}