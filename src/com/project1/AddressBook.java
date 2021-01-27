package com.project1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

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

    public void readFromFile(String path) {
        try {
            ArrayList<String> list = new ArrayList<String>(Files.readAllLines(Paths.get(path)));

            for (String info: list) {
                AddressEntry entry = new AddressEntry();
                ArrayList<String> entryList = new ArrayList<String>(Arrays.asList(info.split(",")));
                entry.setFirstName(entryList.get(0).trim());
                entry.setLastName(entryList.get(1).trim());
                entry.setStreet(entryList.get(2).trim());
                entry.setCity(entryList.get(3).trim());
                entry.setState(entryList.get(4).trim());
                entry.setZip(Integer.parseInt(entryList.get(5).trim()));
                entry.setPhone(entryList.get(6).trim());
                entry.setEmail(entryList.get(7).trim());
                add(entry);
            }

            System.out.println("Read in " + list.size() + " new Addresses. Successfully loaded");
            System.out.println("There are currently " + addressEntryList.size() + " Addresses in the Address Book.");
        }
        catch (IOException e) {

        }
    }

    public void remove(AddressEntry entry) {
        addressEntryList.remove(entry);
    }

    public ArrayList<AddressEntry> find(String startOf_lastName) {
        Stream<AddressEntry> stream = addressEntryList.stream().filter(entry -> entry.getLastName().contains(startOf_lastName));
        ArrayList<AddressEntry> result = new ArrayList<>();

        stream.forEach(s -> result.add(s));
        return result;
    }
}

