package com.project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates a new instance of an AddressBook object and adds 2 AddressEntry with the given data
 * then lists the entries in the output
 */
public class AddressBookApplication {
    private static char selection;

    public static void main(String[] args) {
        // Create an instance of AddressBook
        AddressBook ab = new AddressBook();

        Scanner input = new Scanner(System.in);

        while (selection != 'f') {
            Menu.prompt_Menu();
            selection = input.next().charAt(0);

            switch(selection) {
                case 'a':
                    ab.readFromFile();
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
                    break;
            }
        }
    }

    private static void findEntry(AddressBook ab) {
    }

    private static void removeEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        int selection;
        char isRemove;
        System.out.println("Enter in Last Name of contact to remove:");
        System.out.print("> ");
        String lastName = input.nextLine();
        ArrayList<AddressEntry> entries = ab.find(lastName);

        System.out.println("The following " + entries.size() + " entries were found in the address book");
        System.out.println("Select number of entry you wish to remove:");

        for (int i = 1; i <= entries.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(entries.get(i-1).toString());
        }

        System.out.print("> ");
        selection = Integer.parseInt(input.nextLine());

        System.out.println("Hit y to remove the following entry or n to return to main menu");
        System.out.println(entries.get(selection-1).toString());
        System.out.print("> ");
        isRemove = input.next().charAt(0);

        if (isRemove == 'y') {
            ab.remove(entries.get(selection-1));
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

