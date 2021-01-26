package com.project1;

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
                case 'b':
                    addEntry(ab);
                case 'c':
                    ab.remove();
                case 'd':
                    ab.find();
                case 'e':
                    ab.list();
                case 'f':
                    break;
            }
        }
    }

    private static void addEntry(AddressBook ab) {
        Scanner input = new Scanner(System.in);
        AddressEntry entry = new AddressEntry();
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        int zip;
        String phone;
        String email;

        Menu.prompt_FirstName();
        firstName = input.nextLine();
        entry.setFirstName(firstName);

        Menu.prompt_LastName();
        lastName = input.nextLine();
        entry.setLastName(lastName);

        Menu.prompt_Street();
        street = input.nextLine();
        entry.setStreet(street);

        Menu.prompt_City();
        city = input.nextLine();
        entry.setCity(city);

        Menu.prompt_State();
        state = input.nextLine();
        entry.setState(state);

        Menu.prompt_Zip();
        zip = Integer.parseInt(input.nextLine());
        entry.setZip(zip);

        Menu.prompt_Telephone();
        phone = input.nextLine();
        entry.setPhone(phone);

        Menu.prompt_Email();
        email = input.nextLine();
        entry.setEmail(email);

        ab.add(entry);

        System.out.println("Thank you! The following contact has been added to your address book: \n");
        entry.toString();
    }

}

