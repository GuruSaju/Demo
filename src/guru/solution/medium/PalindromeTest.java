package guru.solution.medium;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function PalindromeTwo(str) take the str parameter being passed and return the 
 * string true if the parameter is a palindrome, (the string is the same forward as it is backward) 
 * otherwise return the string false. The parameter entered may have punctuation and symbols but they 
 * should not affect whether the string is in fact a palindrome. For example: "Anne, I vote more cars 
 * race Rome-to-Vienna" should return true. 
 */
public class PalindromeTest {
	 public static String PalindromeTwo(String str) { 
		 //use string builder for faster performace??
		    String normal="";
		    String reverse="";
		    String result="false";
		    for(int i=0;i<str.length();i++){
		        if(Character.isLetter(str.charAt(i))){
		            normal=normal+str.charAt(i);
		            reverse=str.charAt(i)+reverse;
		        }
		    }
		    if(normal.toLowerCase().equals(reverse.toLowerCase())){
		        result="true";
		    }
		    return result;
		    
		  } 
		  
		  public static void main (String[] args) {  
   
		    Scanner s = new Scanner(System.in);
		    System.out.print(PalindromeTwo(s.nextLine())); 
		  }   
		  
		}