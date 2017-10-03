/**
 * File Name: BasicApp.java<br>
 * Cassetta, Mark<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.mc;

import com.sqa.mc.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cassetta, Mark
 * @version 1.0.0
 * @since 1.0
 */
public class BasicApp {

	private static String appName = "Basic App";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doSomething();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 *
	 */
	private static void doSomething() {
		System.out.println("Doing something...");
	}
}
