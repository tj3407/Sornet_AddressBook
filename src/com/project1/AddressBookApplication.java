package com.project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that contains the main method to run the Address Book application.
 * This class creates a single AddressBook instance that is used throughout the
 * life of the application
 *
 * @author Tey Jon Sornet
 */
public class AddressBookApplication {
    /**
     * Main method to run the Address Book application
     * @param args an array of String(s)
     */
    public static void main(String[] args) {
        // Create an instance of AddressBook
        AddressBook ab = new AddressBook();

        // Prompt for menu and retrieve selection
        char selection = Menu.prompt_Menu(System.in);

        while (selection != 'f') {
            switch(selection) {
                case 'a':
                    readFromFile(ab);
                    break;
                case 'b':
                    addEntry(ab);
                    break;
                case 'c':
                    removeEntry(ab);
                    break;
                case 'd':
                    findEntry(ab);
                    break;
                case 'e':
                    ab.list();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            selection = Menu.prompt_Menu(System.in);
        }

        if (selection == 'f') {
            System.out.println("Goodbye!");
        }
    }

    /**
     * Method to read a string for the location of the file to be loaded
     * @param ab an AddressBook instance
     */
    private static void readFromFile(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in filename:");
        System.out.print("> ");

        ab.readFromFile(input.nextLine());
    }

    /**
     * Method to find a user by last name
     * @param ab an AddressBook instance
     */
    private static void findEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in all or the beginning of the Last Name of the contact you wish to find:");
        System.out.print("> ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = ab.find(lastName);

        if (result.size() > 0) {
            System.out.println("The following " + result.size() + " entries were found in the address book for a last name starting with " + lastName);
            for (int i = 0; i < result.size(); i++) {
                System.out.println(i+1 + ": " + result.get(i).toString());
            }
        } else {
            System.out.println("No entries found.");
        }
    }

    /**
     * Method to remove an entry in an AddressBook by last name
     * @param ab an AddressBook instance
     */
    private static void removeEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        int selection;
        char isRemove;
        System.out.println("Enter in Last Name of contact to remove:");
        System.out.print("> ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> result = ab.find(lastName);

        if (result.size() <= 0) {
            System.out.println("No entries found");
            return;
        }

        System.out.println("The following " + result.size() + " entries were found in the address book");
        System.out.println("Select number of entry you wish to remove:");

        for (int i = 1; i <= result.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(result.get(i-1));
        }

        System.out.print("> ");
        selection = Integer.parseInt(input.nextLine());

        while (selection <= 0 || selection > result.size()) {
            System.out.println("Invalid selection. Please try again");
            System.out.print("> ");
            selection = Integer.parseInt(input.nextLine());
        };

        System.out.println("Hit y to remove the following entry or n to return to main menu:");
        System.out.println(result.get(selection-1));
        System.out.print("> ");
        isRemove = input.next().charAt(0);

        while (isRemove != 'n') {
            if (isRemove == 'y') {
                AddressEntry contact = result.get(selection-1);
                ab.remove(contact);
                System.out.println("You have successfully removed the " + contact.getFirstName() + " " + contact.getLastName() + " contact");
                break;
            } else {
                System.out.println("Invalid selection. Please try again\n");
                System.out.print("> ");
                isRemove = input.next().charAt(0);
            }
        }
    }

    /**
     * Method to prompt user for a single AddressEntry detail and adds to
     * our AddressBook instance
     * @param ab an AddressBook instance
     */
    private static void addEntry(AddressBook ab) {
        AddressEntry entry = new AddressEntry();
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        int zip;
        String phone;
        String email;

        firstName = Menu.prompt_FirstName(System.in);
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName(System.in);
        entry.setLastName(lastName);

        street = Menu.prompt_Street(System.in);
        entry.setStreet(street);

        city = Menu.prompt_City(System.in);
        entry.setCity(city);

        state = Menu.prompt_State(System.in);
        entry.setState(state);

        zip = Menu.prompt_Zip(System.in);
        entry.setZip(zip);

        phone = Menu.prompt_Telephone(System.in);
        entry.setPhone(phone);

        email = Menu.prompt_Email(System.in);
        entry.setEmail(email);

        ab.add(entry);

        System.out.println("Thank you! The following contact has been added to your address book: \n");
        System.out.println(entry.toString());
    }

}

