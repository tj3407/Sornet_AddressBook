package com.project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
        for (int i = 1; i <= addressEntryList.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(addressEntryList.get(i-1).toString());
        }
    }

    public void add(AddressEntry entry) {
        addressEntryList.add(entry);
    }

    public void readFromFile() {
    }

    public void remove(AddressEntry entry) {
    }

    public ArrayList<AddressEntry> find(String startOf_lastName) {
        return addressEntryList;
    }
}

