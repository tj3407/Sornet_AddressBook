package com.project1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

/**
 * Class that holds a collection of objects of the class AddressEntry
 * Contains the methods to perform operations against the AddressEntry
 * collection such as add, remove, readFromFile, list, find, and
 * getAddressEntry
 */
public class AddressBook {
    private ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * Method to iterate through addressEntryList array and display
     * a string to output.
     */
    public void list() {
        // Optional sorting of ArrayList by First Name
        addressEntryList.sort(Comparator.comparing(AddressEntry::getFirstName));

        // Iterate through AddressEntry and print out the data
        for (int i = 1; i <= addressEntryList.size(); i++) {
            System.out.print(i + ": ");
            System.out.println(addressEntryList.get(i-1).toString());
        }
    }

    /**
     * Method that adds an AddressEntry object into our AddressBook array
     * @param entry an AddressEntry object
     */
    public void add(AddressEntry entry) {
        addressEntryList.add(entry);
    }

    /**
     * Method that reads data from a file, creates an AddressEntry object and adds
     * the object to our AddressBook array
     * @param path a String to indicate the location of the file to be read
     */
    public void readFromFile(String path) {
        try {
            ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get(path)));

            for (String info: list) {
                AddressEntry entry = new AddressEntry();
                ArrayList<String> entryList = new ArrayList<>(Arrays.asList(info.split(",")));
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
            System.out.println(e);
        }
    }

    /**
     * Method to remove a single AddressEntry array object from our AddressBook array
     * @param entry an AddressEntry object
     */
    public void remove(AddressEntry entry) {
        addressEntryList.remove(entry);
    }

    /**
     * Method to find entries in our AddressBook array by lastName and returns the
     * result, if any
     * @param startOf_lastName a String that indicates the start of a person's last name in our
     *                         AddressBook array
     * @return the AddressEntry object(s) which contains lastName === startOf_lastName
     */
    public ArrayList<AddressEntry> find(String startOf_lastName) {
        Stream<AddressEntry> stream = addressEntryList.stream().filter(entry -> entry.getLastName().contains(startOf_lastName));
        ArrayList<AddressEntry> result = new ArrayList<>();

        stream.forEach(s -> result.add(s));
        return result;
    }

    /**
     * Method to retrieve the AddressBook array
     * @return the AddressBook array
     */
    public ArrayList<AddressEntry> getAddressEntryList() {
        return addressEntryList;
    }
}

