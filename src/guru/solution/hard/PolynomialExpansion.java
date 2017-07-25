package guru.solution.hard;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class PolynomialExpansion {
	public static String PolynomialExpansion1(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	    String[] halves=str.split("\\)"); 
	    ArrayList<Component> left = new ArrayList();
	    ArrayList<Component> right = new ArrayList();
	    ArrayList<String> lefts = new ArrayList();
	    ArrayList<String> rights = new ArrayList();
	    String letterWhole="";
	     String s="";
	    for(int i=1;i<halves[0].length();i++){
	        if(halves[0].charAt(i)=='-' || halves[0].charAt(i)=='+'){
	            if(halves[0].charAt(i-1)!='^' && halves[0].charAt(i-1)!='(' ){
	                lefts.add(s);
	                s="";
	                s=s+halves[0].charAt(i);
	            }
	            else{
	               s=s+halves[0].charAt(i); 
	            }
	        }
	        else{
	            s=s+ halves[0].charAt(i);
	        }
	    }
	   // System.out.println(s);
	    lefts.add(s);
	    s="";
	      for(int j=1;j<halves[1].length();j++){
	        if(halves[1].charAt(j)=='-' || halves[1].charAt(j)=='+'){
	            if(halves[1].charAt(j-1)!='^' && halves[1].charAt(j-1)!='(' ){
	                rights.add(s);
	                s="";
	                s=s+halves[1].charAt(j);
	            }
	            else{
	               s=s+halves[1].charAt(j); 
	            }
	        }
	        else{
	            s=s+ halves[1].charAt(j);
	        }
	    }
	     // System.out.println(s);
	    rights.add(s);
	    
	  
	    for(String c:lefts){
	    	boolean isletter=false;
	        String[] comp={null,null};
	        Component cmp=new Component();
	        int q=1;
	        comp[0]=c;
	        if(c.contains("^")){
	          comp=c.split("\\^");
	        }  
	          if(Character.isLetter(comp[0].charAt(comp[0].length()-1))){
	        	  q=2;
	        	  isletter=true;
	        	  cmp.letter=true;
	              if(comp[0].length()>=2 ) {
	            	  //&& comp[0].charAt(0)!='+' && comp[0].charAt(0)!='-'
	              cmp.number=Integer.parseInt(comp[0].substring(0,comp[0].length()-1));
	              letterWhole=""+comp[0].charAt(comp[0].length()-1);
	              
	              }
	              else{
	            	  if(comp[0].charAt(0)!='+')
		                  cmp.number=-1;
		                  else
		                  cmp.number=1;
	              }
	          }
	          else{
	             cmp.number=Integer.parseInt(comp[0]);
	              cmp.letter=false; 
	          }
	          if(comp[1]!=null && isletter==true){
	              cmp.exponent=Integer.parseInt(comp[1]);
	          }
	          else if(isletter==true){
	        	  cmp.exponent=1;
	          }
	          else{
	              cmp.exponent=0;
	          }
	         if(comp[0].equals(c) && q==1){
	            cmp.number=Integer.parseInt(c);
	            cmp.exponent=0;
	            cmp.letter=false;
	        }
	        // System.out.println(cmp.number +  " " +cmp.exponent + " "+ cmp.letter);
	          left.add(cmp);
	        q=1;
	        }
	        for(String r:rights){
	        	boolean isletter1=false;
	        String[] comp1={null,null};
	        Component cmp1=new Component();
	        int a=1;
	        comp1[0]=r;
	        if(r.contains("^")){
	          comp1=r.split("\\^");
	        }
	          if(Character.isLetter(comp1[0].charAt(comp1[0].length()-1))){
	        	  isletter1=true;
	              a=2;
	              cmp1.letter=true;
	              if(comp1[0].length()>=2 ) {
	            	  //&& comp1[0].charAt(0)!='+' && comp1[0].charAt(0)!='-'
	              cmp1.number=Integer.parseInt(comp1[0].substring(0,comp1[0].length()-1));
	              letterWhole=""+comp1[0].charAt(comp1[0].length()-1);
	              
	              }
	              else{
	                  if(comp1[0].charAt(0)!='+')
	                  cmp1.number=-1;
	                  else
	                  cmp1.number=1;	              }
	          }
	          else{
	             cmp1.number=Integer.parseInt(comp1[0]);
	              cmp1.letter=false; 
	          }
	          if(comp1[1]!=null && isletter1==true){
	              cmp1.exponent=Integer.parseInt(comp1[1]);
	          }
	          else if(isletter1==true){
	        	  cmp1.exponent=1;
	          }
	          else{
	              cmp1.exponent=0;
	          }
	        
	        if(comp1[0].equals(r) && a==1){
	            cmp1.number=Integer.parseInt(r);
	            cmp1.exponent=0;
	            cmp1.letter=false;
	        }
	       // System.out.println(cmp1.number +  " " +cmp1.exponent + " "+ cmp1.letter);
	          right.add(cmp1);
	         a=1;
	        }
	        ArrayList<Component>  answers =new ArrayList<Component>();
	        //Component[] answers=new Component[left.size()*right.size()];
	        String result="";
	        int index=0;
	        for(Component l:left){
	            for(Component r:right){
	            	Component cmp=new Component();
	                cmp.number=l.number*r.number;
	                cmp.exponent=l.exponent+r.exponent;
	                if(cmp.number>0 && cmp.number!=1 && cmp.number!=-1){
	                	cmp.equation=cmp.equation+"+"+cmp.number;
	                }
	                else if(cmp.number<0 && cmp.number!=1 && cmp.number!=-1){
	                	cmp.equation=cmp.equation+""+cmp.number;
	                }
	                if((l.letter == true || r.letter==true)&& cmp.exponent!=0){
	                	if(cmp.number==1)
	                	cmp.equation=cmp.equation+"+"+letterWhole;
	                	else if(cmp.number==-1)
	                	cmp.equation=cmp.equation+"-"+letterWhole;
	                	else{
	                		cmp.equation=cmp.equation+letterWhole;
	                	}
	                	cmp.letter=true;
	                }
	                if(cmp.exponent!=0 && cmp.exponent!=1){
	                	cmp.equation=cmp.equation+"^"+cmp.exponent;
	                }
	                answers.add(cmp);
	               // System.out.println(cmp.equation);
	                index++;
	            
	            }
	        }
	        Hashtable<Integer,Integer> tableeqn=new Hashtable();
	        for(Component b:answers){
	        	if(tableeqn.containsKey(b.exponent)){
	        		tableeqn.put(b.exponent, tableeqn.get(b.exponent)+b.number);
	        	}
	        	else{
	        		tableeqn.put(b.exponent, b.number);
	        	}
	        }
	        ArrayList<Component>  answersComb =new ArrayList<Component>();
	        for(int exp:tableeqn.keySet()){
	        	Component cmp=new Component();
                cmp.number=tableeqn.get(exp);
                cmp.exponent=exp;
                if(cmp.number>0 && cmp.number!=1 && cmp.number!=-1){
                	cmp.equation=cmp.equation+"+"+cmp.number;
                }
                else if(cmp.number<0 && cmp.number!=1 && cmp.number!=-1){
                	cmp.equation=cmp.equation+""+cmp.number;
                }
                if(cmp.exponent!=0){
                	if(cmp.number==1)
	                	cmp.equation=cmp.equation+"+"+letterWhole;
	                	else if(cmp.number==-1)
	                	cmp.equation=cmp.equation+"-"+letterWhole;
	                	else
                	cmp.equation=cmp.equation+letterWhole;
                	cmp.letter=true;
                }
                if(cmp.exponent!=0 && cmp.exponent!=1){
                	cmp.equation=cmp.equation+"^"+cmp.exponent;
                }
                answersComb.add(cmp);
             //   System.out.println(cmp.equation);
                index++;
            
            }
	        
	        Component cmp1 = new Component();
	        while(answersComb.size()!=0){
	        int largest=Integer.MIN_VALUE;
	        for(Component a:answersComb){
	        	if(a.exponent>largest){
	        		largest=a.exponent;
	        		cmp1=a;
	        	}
	        }
	        answersComb.remove(cmp1);
	        result=result+cmp1.equation;
	        }
	      if(result.charAt(0)=='+'){
	    	  result=result.substring(1,result.length());
	      }
	    return result;
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(PolynomialExpansion1(s.nextLine())); 
	  }   
	  
	}

	class Component{
	    int exponent;
	   boolean letter=false;
	   int number;
	   String equation="";
	}

