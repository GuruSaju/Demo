package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function TimeConvert(num) take the num parameter being passed and return 
 * the number of hours and minutes the parameter converts to (ie. if num = 63 then the 
 * output should be 1:3). Separate the number of hours and minutes with a colon.
 */
public class TimeConverter {
	public static String TimeConvert(int num) { 
	    int hours=num/60;
	    int minutes=num%60;
	    return hours+":"+minutes;
	    
	  } 
	  
	  public static void main (String[] args) {      
	    Scanner s = new Scanner(System.in);
	    System.out.print(TimeConvert(Integer.parseInt(s.nextLine()))); 
	  }   
	  
	}
