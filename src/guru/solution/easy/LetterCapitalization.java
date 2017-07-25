package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function LetterCapitalize(str) take the str parameter being passed and 
 * capitalize the first letter of each word. Words will be separated by only one space.
 */
public class LetterCapitalization {
	 public static String LetterCapitalize(String str) { 
	      String word="";
	    for(int i=0;i<str.length();i++){
	        if(i==0){
	            word=word+Character.toUpperCase(str.charAt(i));
	        }
	        else if(Character.isWhitespace(str.charAt(i))){
	            word=word+str.charAt(i)+Character.toUpperCase(str.charAt(i+1));
	            i=i+1;
	        }
	        else{
	           word=word+str.charAt(i);
	        }
	        
	    }

	       
	    return word;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterCapitalize(s.nextLine())); 
	  }   
	  
	}