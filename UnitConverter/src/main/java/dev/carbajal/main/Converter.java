package dev.carbajal.main;

import java.util.*;

public class Converter {

	static int menuSelection;
	static int subMenuSelection;

	public static void main(String[] args) {

		double result;

		// calling the printMenu() method to print the options menu

		printMenu();

		// getting and checking user input

		Scanner scanner = new Scanner(System.in);		
		menuSelection = scanner.nextInt();

		if (menuSelection > 3 || menuSelection < 0) {

			System.out.println("Invalid input! Please try again.");

			System.out.println(); // adding a line break for readability in the console

			printMenu();
			menuSelection = scanner.nextInt();

		}

		// while loop for the main menu selection

		while (menuSelection != 3) {

			switch (menuSelection) {

			case 1:

				printSubMenu1();
				subMenuSelection = scanner.nextInt();

				// inner switch for liquids menu

				switch (subMenuSelection) {

				case 1: 

					System.out.println("How many cups to convert?");
					double cups = scanner.nextDouble();
					result = (cups * 48);
					System.out.println(cups + " cup(s) is " + result + " teaspoon(s)!");

					System.out.println(); // adding a line break for readability in the console

					printMenu();
					menuSelection = scanner.nextInt();

					break;

				case 2:

					System.out.println("How many gallons to convert?");
					double gallons = scanner.nextDouble();
					result = (gallons * 3.785);
					System.out.println(gallons + " gallon(s) is " + result + " liter(s)!");

					System.out.println(); // adding a line break for readability in the console

					printMenu();
					menuSelection = scanner.nextInt();

					break;

				default:

					System.out.println("Invalid input! Please try again.");

					System.out.println(); // adding a line break for readability in the console
					
					break;

				}
				
				break;

			case 2:

				printSubMenu2();
				subMenuSelection = scanner.nextInt();

				// inner switch for lengths menu

				switch (subMenuSelection) {

				case 1:

					System.out.println("How many miles to convert?");
					double miles = scanner.nextDouble();
					result = (miles * 1.609344);
					System.out.println(miles + " miles(s) is " + result + " kilometer(s)!");

					System.out.println(); // adding a line break for readability in the console

					printMenu();
					menuSelection = scanner.nextInt();

					break;

				case 2:

					System.out.println("How many inches to convert?");
					double inches = scanner.nextDouble();
					result = (inches * 2.54);
					System.out.println(inches + " inches(s) is " + result + " centimeters(s)!");

					System.out.println(); // adding a line break for readability in the console

					printMenu();
					menuSelection = scanner.nextInt();

					break;

				default:

					System.out.println("Invalid input! Please try again.");

					System.out.println(); // adding a line break for readability in the console
				
					
					break;

				}

				break;

			default: 
				break;

			}			
		}

		scanner.close();

	}

	// menu printing methods

	public static void printMenu() {

		System.out.println("Please select an option 1-2:");
		System.out.println("1. Liquid");
		System.out.println("2. Length");
		System.out.println("3. Quit");

	}
	
	public static void printSubMenu1() {

		System.out.println("Please select an option 1-2:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Gallons to Liters");

	}
	
	public static void printSubMenu2() {

		System.out.println("Please select an option 1-2:");
		System.out.println("1. Miles to Kilometers");
		System.out.println("2. Inches to Centimeters");

	}

}
