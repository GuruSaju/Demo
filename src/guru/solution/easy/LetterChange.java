package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function LetterChanges(str) take the str parameter being passed and modify 
 * it using the following algorithm. Replace every letter in the string with the letter 
 * following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel 
 * in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class LetterChange {
	 public static String LetterChanges(String str) { 
	      String word1="";
	     for(int i=0;i<str.length();i++){
	         if(Character.isLetter(str.charAt(i))){
	                 if((int)str.charAt(i)==122 || (int)str.charAt(i)==100 || (int)str.charAt(i)==104 || (int)str.charAt(i)==110 ||(int)str.charAt(i) ==116){
	                    int ascii = (int)str.charAt(i)-31;
	                    word1=word1+(char)ascii;
	                }
	                else{
	                    int ascii1=(int)str.charAt(i)+1;
	                     word1=word1+(char)ascii1;
	                }
	            }
	                else{
	                 word1=word1+str.charAt(i);
	            }
	        }
	         
	     
	    // code goes here   

	       
	    return word1;
	  }
	  
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterChanges(s.nextLine())); 
	  }   
	  
	}