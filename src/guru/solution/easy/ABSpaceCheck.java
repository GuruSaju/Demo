package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function ABCheck(str) take the str parameter being passed and return the string 
 * true if the characters a and b are separated by exactly 3 places anywhere in the string 
 * at least once (ie. "lane borrowed" would result in true because there is exactly three 
 * characters between a and b). Otherwise return the string false.
 */
public class ABSpaceCheck {
	 public static String ABCheck(String str) { 
		 //This logic works
		 if(str.length()<5){
			 return "false";
		 }
		       String result="false";
		    for(int i=0;i<str.length()-4;i++){ 
		        if(str.charAt(i) == 'a' && str.charAt(i+4)=='b'){
		            result="true";
		            break;
		        } 
		    }   
		    return result;    
		  } 
		  
		  public static void main (String[] args) {      
		    Scanner s = new Scanner(System.in);
		    System.out.print(ABCheck(s.nextLine())); 
		  }   
		  
		}