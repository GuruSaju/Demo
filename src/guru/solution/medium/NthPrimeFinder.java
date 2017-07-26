package guru.solution.medium;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru
 * Have the function PrimeMover(num) return the numth prime number. The range will 
 * be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 
 * 16th prime number. 
 */
public class NthPrimeFinder {
	  public static int PrimeMover(int num) { 
		     int max=Integer.MAX_VALUE;
		    int count=0;
		    int resultPrime=0;
		    for(int i=2;i<=max;i++){
		        if(i==2 || i==3){
		            count=count+1;
		        }
		        else{
		            int half=i/2;
		            boolean prime=true;
		            for(int j=2;j<=half;j++){
		                if(i%j==0){
		                    prime=false;
		                }
		            
		            }
		            if(prime){
		                count++;
		            }
		        }
		        if(count==num){
		            resultPrime=i;
		            break;
		        }
		    }
		    return resultPrime;
		  } 
		  
		  public static void main (String[] args) {      
		    Scanner s = new Scanner(System.in);
		    System.out.print(PrimeMover(Integer.parseInt(s.nextLine()))); 
		  }   
		  
		}