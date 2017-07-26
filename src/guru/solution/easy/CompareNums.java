package guru.solution.easy;

import java.util.Scanner;

/**
 * 
 * @author Srisarguru 
 * Have the function CheckNums(num1,num2) take both
 * parameters being passed and return the string true if num2 is greater
 * than num1, otherwise return the string false. If the parameter values
 * are equal to each other then return the string -1
 */
public class CompareNums {
	public static String CheckNums(int num1, int num2) {
		String result = "";
		if (num1 == num2)
			return result = "-1";
		else
			return result = (num2 > num1) ? "true" : "false";

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(CheckNums(50, 60));
	}

}