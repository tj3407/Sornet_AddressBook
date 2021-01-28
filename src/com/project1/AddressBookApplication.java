package com.project1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Creates a new instance of an AddressBook object and adds 2 AddressEntry with the given data
 * then lists the entries in the output
 */
public class AddressBookApplication {
    public static void main(String[] args) {
        // Create an instance of AddressBook
        AddressBook ab = new AddressBook();

        // Prompt for menu and retrieve selection
        char selection = Menu.prompt_Menu();

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
                case 'f':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            selection = Menu.prompt_Menu();
        }
    }

    private static void readFromFile(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in filename:");
        System.out.print("> ");

        ab.readFromFile(input.nextLine());
    }

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

        if (isRemove == 'y') {
            AddressEntry contact = result.get(selection-1);
            ab.remove(contact);
            System.out.println("You have successfully removed the " + contact.getFirstName() + " " + contact.getLastName() + " contact");
        }
    }

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

        firstName = Menu.prompt_FirstName();
        entry.setFirstName(firstName);

        lastName = Menu.prompt_LastName();
        entry.setLastName(lastName);

        street = Menu.prompt_Street();
        entry.setStreet(street);

        city = Menu.prompt_City();
        entry.setCity(city);

        state = Menu.prompt_State();
        entry.setState(state);

        zip = Menu.prompt_Zip();
        entry.setZip(zip);

        phone = Menu.prompt_Telephone();
        entry.setPhone(phone);

        email = Menu.prompt_Email();
        entry.setEmail(email);

        ab.add(entry);

        System.out.println("Thank you! The following contact has been added to your address book: \n");
        System.out.println(entry.toString());
    }

}

