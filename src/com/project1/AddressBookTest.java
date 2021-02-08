package com.project1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test AddressBook class
 *
 * @author Tey Jon Sornet
 */
class AddressBookTest {
    /**
     * Method to test the add function in AddressBook
     */
    @Test
    void testAdd() {
        AddressBook ab = new AddressBook();
        AddressEntry entry = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "555-555-5555", "test@test.com");
        ab.add(entry);
        assertEquals(ab.find("Doe").get(0), entry);
    }

    /**
     * Method to test the readFromFile function in AddressBook
     */
    @Test
    void testReadFromFile() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("/Users/tj3407/AddressInputDataFile.txt");
        assertEquals(ab.getAddressEntryList().size(), 5);
    }

    /**
     * Method to test the remove function in AddressBook
     */
    @Test
    void testRemove() {
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "555-555-5555", "test@test.com");
        AddressEntry entry2 = new AddressEntry("John", "Deer", "Mission", "Hayward", "CA", 94544, "555-555-5555", "test@test.com");
        ab.add(entry1);
        ab.add(entry2);
        AddressEntry entryToRemove = ab.find("Doe").get(0);

        ab.remove(entryToRemove);
        assertEquals(ab.getAddressEntryList().size(), 1);
    }

    /**
     * Method to test the find method in AddressBook
     */
    @Test
    void testFind() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("/Users/tj3407/AddressInputDataFile.txt");
        AddressEntry entry = ab.find("Doe").get(0);
        assertEquals(entry, ab.getAddressEntryList().get(0));
    }

    /**
     * Method to test the getAddressEntryList method in AddressBook
     */
    @Test
    void testGetAddressEntryList() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("/Users/tj3407/AddressInputDataFile.txt");
        ArrayList<AddressEntry> entries = ab.getAddressEntryList();
        assertEquals(entries, ab.getAddressEntryList());
    }
}