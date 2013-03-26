package com.sample.commandlineapp;

/**
 * Encapsulates a main method to run the application as a standalone application.
 * 
 * @author Sample
 * @version 1.0.0
 */
public class Main {
	public static void main(String[] args) throws Exception {
		new Driver().run(args);
		System.exit(0);
	}
}
