package guru.solution.medium;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function RunLength(str) take the str parameter being passed and return 
 * a compressed version of the string using the Run-length encoding algorithm. This 
 * algorithm works by taking the occurrence of each repeating character and outputting 
 * that number along with a single character of the repeating sequence. 
 * For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any 
 * numbers, punctuation, or symbols.
 */
public class LetterNumbers {
	public static String RunLength(String str) { 
		  long time = System.currentTimeMillis();
	       char r=str.charAt(0);
	       String result="";
	       int count=0;
	    for (int i=0;i<str.length();i++){
	        if(r==str.charAt(i)){
	            count++;
	        }
	        else{
	            result=result+count+r;
	            count=0;
	            r=str.charAt(i);
	            count++;
	        }
	        
	        if(i==str.length()-1){
	            result=result+count+r;
	        }
	    } 
	    long endtime= System.currentTimeMillis();
	    System.out.println(endtime-time);
	    return result;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(RunLength(s.nextLine())); 
	  }   
	  
	}
