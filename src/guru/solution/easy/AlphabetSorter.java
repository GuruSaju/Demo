package guru.solution.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function AlphabetSoup(str) take the str string parameter being passed 
 * and return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
 * Assume numbers and punctuation symbols will not be included in the string. 
 */
public class AlphabetSorter {
	  public static String AlphabetSoup(String str) { 
		       int[] num=new int[str.length()];
		       String result=""; //Use Stringbuilder or String buffer for better performance.
		    for(int i=0;i<str.length();i++){
		        num[i]=(int)str.charAt(i);
		    }   
		    Arrays.sort(num);
		    for(int j:num){
		        result=result + (char)j;
		    }
		    return result;
		    
		  } 
		  
		  public static void main (String[] args) {    
		    Scanner s = new Scanner(System.in);
		    System.out.print(AlphabetSoup(s.nextLine())); 
		  }   
		  
		}