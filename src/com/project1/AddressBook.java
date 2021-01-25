package com.project1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Holds a collection of objects of the class AddressEntry
 * Contains an add method to add new AddressEntry
 * Contains an list method to iterate through an ArrayList of AddressEntry
 */
public class AddressBook {
    private ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    public void list() {
        // Optional sorting of ArrayList by First Name
        addressEntryList.sort(Comparator.comparing(AddressEntry::getFirstName));

        // Iterate through AddressEntry and print out the data
        for (AddressEntry item : addressEntryList) {
            System.out.println(item.toString());
        }
    }

    public void add(AddressEntry entry) {
        // add the entry to the AddressEntry ArrayList
        addressEntryList.add(entry);
    }
}

