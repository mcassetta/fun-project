/**
 * File Name: AppBasics.java<br>
 * Cassetta, Mark<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.mc.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cassetta, Mark
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	public static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank You and wish them well.
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of the Application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println("Thank you " + name + ", for using the " + appName + " Application.\nHave a great day!");
	}

	/**
	 * Helper methos which greets the user and welcomes them to the Application.
	 * This method then takes their name and returns it to the calling method.
	 *
	 * @param appName
	 *            The name of the Application
	 * @return name The assigned name of the user
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}
}
