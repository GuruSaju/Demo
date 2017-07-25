package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function SimpleSymbols(str) take the str parameter being passed and 
 * determine if it is an acceptable sequence by either returning the string true or 
 * false. The str parameter will be composed of + and = symbols with several letters 
 * between them (ie. ++d+===+c++==a) and for the string to be true each letter must be 
 * surrounded by a + symbol. So the string to the left would be false. The string will 
 * not be empty and will have at least one letter. 
 */
public class SimpleSymbolization {
	 public static String SimpleSymbols(String str) { 
		  
		    // code goes here   
		    /* Note: In Java the return type of a function and the 
		       parameter types being passed are defined, so this return 
		       call must match the return type of the function.
		       You are free to modify the return type. */
		 String result="false";
		    if(Character.isLetter(str.charAt(0))){
		        result="false";
		    }
		    else{
		    for (int i=0;i<str.length();i++){
		        if(str.charAt(i)=='+' && i+2<str.length()){
		            if(Character.isLetter(str.charAt(i+1)) ){
		                if(str.charAt(i+2)=='+'){
		                    result="true";
		                }
		                else{
		                    result="false";
		                    break;
		                }
		            }
		        }
		    } 
		    }
		    return result;
		  }  
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(SimpleSymbols(s.nextLine())); 
		  }   
		  
		}