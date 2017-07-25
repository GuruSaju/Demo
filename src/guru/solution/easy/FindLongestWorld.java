package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. 
 * If there are two or more words that are the same length, return the first word from the string with that length. 
 * Ignore punctuation and assume sen will not be empty.
 */
public class FindLongestWorld {
	 public static String LongestWord(String sen) { 
	     String[] words=sen.split(" ");
	     int largest=0;
	     String large="";
	     for(String word:words){
	         int wordcount=0;
	         for(int i=0;i< word.length();i++){
	             if(((int)word.charAt(i) > 65 && (int)word.charAt(i) < 91) || ((int)word.charAt(i) > 96 && (int)word.charAt(i) < 123)){
	                 wordcount++;
	             }
	             if(largest<wordcount){
	                 large=word;
	                 largest=wordcount;
	             }
	         }
	     }
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       
	    return large;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	  }   
	  
	}