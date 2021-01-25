package com.project1;

/**
 * Creates a new instance of an AddressBook object and adds 2 AddressEntry with the given data
 * then lists the entries in the output
 */
public class AddressBookApplication {
    private static void initAddressBookExercise(AddressBook ab) {
        // Create 1st instance of AddressEntry
        AddressEntry entry1 = new AddressEntry("John", "Doe", "Carlos Bee", "Hayward", "CA", 94544, "555-55-5555", "john@doe.com");

        // Create 2nd instance of AddressEntry
        AddressEntry entry2 = new AddressEntry();
        entry2.setFirstName("Jane");
        entry2.setLastName("Smith");
        entry2.setStreet("Mission Blvd");
        entry2.setCity("San Francisco");
        entry2.setState("CA");
        entry2.setZip(93434);
        entry2.setPhone("444-444-4444");
        entry2.setEmail("jane@smith.com");

        // Add the entries in AddressBook
        ab.add(entry1);
        ab.add(entry2);
    }

    public static void main(String[] args) {
        // Create an instance of AddressBook
        AddressBook ab = new AddressBook();

        // Create 2 entries in AddressBook
        initAddressBookExercise(ab);

        // Iterate through the entries and print in the output
        ab.list();
    }

}

