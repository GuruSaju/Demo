package guru.solution.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 
 * @author Srisarguru
 * Using the Java language, have the function BlackjackHighest(strArr) take the strArr parameter being passed which 
 * will be an array of numbers and letters representing blackjack cards. Numbers in the array will be written out. 
 * So for example strArr may be ["two","three","ace","king"]. The full list of possibilities for strArr is: two, three, 
 * four, five, six, seven, eight, nine, ten, jack, queen, king, ace. Your program should output below, above, or blackjack 
 * signifying if you have blackjack (numbers add up to 21) or not and the highest card in your hand in relation to whether 
 * or not you have blackjack. If the array contains an ace but your hand will go above 21, you must count the ace as a 1. 
 * You must always try and stay below the 21 mark. So using the array mentioned above, the output should be below king. 
 * The ace is counted as a 1 in this example because if it wasn't you would be above the 21 mark. Another example would 
 * be if strArr was ["four","ten","king"], the output here should be above king. If you have a tie between a ten and a face 
 * card in your hand, return the face card as the "highest card". If you have multiple face cards, the order of importance 
 * is jack, queen, then king.
 * 
 * Input:"four","ace","ten"
Output:"below ten"

Input:"ace","queen"
Output:"blackjack ace"
 */
public class BlackJack {
	
	//to map string will corresponding value
	public static HashMap<String,Integer> getCards(){
		HashMap<String, Integer> cardMap = new HashMap<String, Integer>();
		 cardMap.put("ace",11);
		 cardMap.put("two",2);
		 cardMap.put("three",3);
		 cardMap.put("four",4);
		 cardMap.put("five",5);
		 cardMap.put("six",6);
		 cardMap.put("seven",7);
		 cardMap.put("eight",8);
		 cardMap.put("nine",9);
		 cardMap.put("ten",10);
		 cardMap.put("jack",10);
		 cardMap.put("queen",10);
		 cardMap.put("king",10);
		return cardMap;
	}
	
	//to map string with respective priority
	public static HashMap<String,Integer> getCardsPriority(){
		HashMap<String, Integer> cardPriorityMap = new HashMap();
		 cardPriorityMap.put("ace",13);
		 cardPriorityMap.put("two",1);
		 cardPriorityMap.put("three",2);
		 cardPriorityMap.put("four",3);
		 cardPriorityMap.put("five",4);
		 cardPriorityMap.put("six",5);
		 cardPriorityMap.put("seven",6);
		 cardPriorityMap.put("eight",7);
		 cardPriorityMap.put("nine",8);
		 cardPriorityMap.put("ten",9);
		 cardPriorityMap.put("jack",10);
		 cardPriorityMap.put("queen",11);
		 cardPriorityMap.put("king",12);
		return cardPriorityMap;
	}
	
	public static String calculateBlackJack(List<String> cards){
		
		HashMap<String,Integer> cardsMap=getCards();
		HashMap<String,Integer> cardsPriorityMap=getCardsPriority();
		//cards.stream().forEach(i->System.out.println(cardsMap.get(i)));
		
		//using stream get the sum of values from the input
		int blackJackNo = cards.stream().mapToInt(i -> cardsMap.get(i)).sum();
		
		// sort the list based on priority.
		List<String> priorityList= cards.stream().map(i -> cardsPriorityMap.get(i)).sorted(Collections.reverseOrder())
				.map(i-> cardsPriorityMap.entrySet().stream().filter(e->e.getValue().equals(i)).map(Map.Entry::getKey)
						.findFirst().get()).collect(Collectors.toList());
		
		//System.out.println(blackJackNo + " " + priorityList);
		
		if(blackJackNo<21){
			return "below "+priorityList.get(0);
		}
		else if(blackJackNo==21){
			return "blackjack "+priorityList.get(0);
		} else if(blackJackNo > 21 && priorityList.contains("ace")){
			//count no of aces
			int count =(int) priorityList.stream().filter(x->x.equals("ace")).count();
			
			while(count>0){
				blackJackNo = blackJackNo-10;
				//remove ace from list
				priorityList.remove(0);
				count--;
				if(blackJackNo==21){
					return "blackjack "+priorityList.get(0);
				}
				else if(blackJackNo<21){
					return "below "+priorityList.get(0);
				}
			}
		}
		//if none of the conditions above return then surely it is above 21
		return "above "+priorityList.get(0);
	}
	
	 public static void main (String[] args) {      
		   List<String> sendList = Arrays.asList("four","ace","ten");
		   //"three","seven","ace" = blackjack ace
		   //"ace","ace","ace","king","eight" = blackjack king
		   //"ace","ace","king","eight" = below king
		   //"four","ace","ten" = below ten
		   System.out.println(calculateBlackJack(sendList));
		  }  
}
