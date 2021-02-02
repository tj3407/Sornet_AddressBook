package com.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void testList() {
    }

    @Test
    void testAdd() {
        AddressBook ab = new AddressBook();
        AddressEntry entry = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "555-555-5555", "test@test.com");
        ab.add(entry);
        assertEquals(ab.find("Doe").get(0), entry);
    }

    @Test
    void testReadFromFile() {
        AddressBook ab = new AddressBook();
        ab.readFromFile("/Users/tj3407/AddressInputDataFile.txt");
        assertEquals(ab.getAddressEntryList().size(), 3);
    }

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

    @Test
    void testFind() {
    }
}