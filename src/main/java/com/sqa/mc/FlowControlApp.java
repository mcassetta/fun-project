/**
 * File Name: FlowControlApp.java<br>
 * Cassetta, Mark<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.mc;

import java.util.*;

import com.sqa.mc.helpers.*;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cassetta, Mark
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	private static String appName = "Flow Control App";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. *You will need to use the
	 * Integer.parseInt() method to convert a user supplied string to a number
	 * type variable that can be evaluated.
	 */
	private static void determineMonthBasedOnInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of a month: ");
		String input = scanner.nextLine();
		int month = Integer.parseInt(input);
		String selectedMonth;
		switch (month) {
		case 1:
			selectedMonth = "January";
			break;
		case 2:
			selectedMonth = "February";
			break;
		case 3:
			selectedMonth = "March";
			break;
		case 4:
			selectedMonth = "April";
			break;
		case 5:
			selectedMonth = "May";
			break;
		case 6:
			selectedMonth = "June";
			break;
		case 7:
			selectedMonth = "July";
			break;
		case 8:
			selectedMonth = "August";
			break;
		case 9:
			selectedMonth = "September";
			break;
		case 10:
			selectedMonth = "October";
			break;
		case 11:
			selectedMonth = "November";
			break;
		case 12:
			selectedMonth = "December";
			break;
		default:
			selectedMonth = "Invalid month";
			break;
		}
		System.out.println("Current month chosen is " + selectedMonth);
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static void evalGrade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number < 59) {
			System.out.println("You have failed with an F");
		} else if (number > 60 && number < 69) {
			System.out.println("You got a D.");
		} else if (number > 70 && number < 79) {
			System.out.println("You got a C");
		} else if (number > 80 && number < 89) {
			System.out.println("You got a B!");
		} else if (number > 90) {
			System.out.println("You got an A! Well done!");
		}
	}

	/**
	 * Write a function which takes an int parameter and print the message on
	 * screen that “number is greater than 10” otherwise it should print “number
	 * is smaller than 10” (Can you support if parameter is equal to 10)
	 */
	private static void evalNumberAgainst10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to evaluate against 10: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		if (number > 10) {
			System.out.println(number + " is greater than 10");
		} else if (number < 10) {
			System.out.println(number + " is less than 10");
		} else if (number == 10) {
			System.out.println(number + " is equal to 10");
		}
	}
}
