package com.project1;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Class that contains the prompts used to interact with a user
 * throughout the application.
 *
 * @author Tey Jon Sornet
 */
public class Menu {
    /**
     * Method that prompts user to enter first name
     * @return a String containing first name value
     */
    public static String prompt_FirstName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("First Name:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter last name
     * @return a String containing last name value
     */
    public static String prompt_LastName(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Last Name:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter street name
     * @return a String containing street name value
     */
    public static String prompt_Street(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Street:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter city name
     * @return a String containing city name value
     */
    public static String prompt_City(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("City:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter state
     * @return a String containing state value
     */
    public static String prompt_State(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("State:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter zip code
     * @return an int containing zip code value
     */
    public static int prompt_Zip(InputStream in) {
        Scanner input = new Scanner(in);
        String zip;

        do {
            System.out.println("Zip:");
            System.out.print("> ");
            zip = input.nextLine();

            if (!(zip.matches("\\d+"))) {
                System.out.println("Invalid entry. Please try again.");
            }
        } while(!(zip.matches("\\d+")));

        return Integer.parseInt(zip);
    }

    /**
     * Method that prompts user to enter phone number
     * @return a String containing phone number value
     */
    public static String prompt_Telephone(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Telephone:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method that prompts user to enter email
     * @return a String containing email value
     */
    public static String prompt_Email(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("Email:");
        System.out.print("> ");
        return input.nextLine();
    }

    /**
     * Method to prompt a user to enter a selection from a menu
     * @return a char that contains the user's selected option
     */
    public static char prompt_Menu(InputStream in) {
        Scanner input = new Scanner(in);
        System.out.println("******************");
        System.out.println("Please enter in your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("******************");
        System.out.print("> ");
        return input.nextLine().charAt(0);
    }
}
