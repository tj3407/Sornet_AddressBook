package com.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    @Test
    void testToString() {
    }

    @Test
    void test1SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "John";
        entry.setFirstName(name1);
        assertEquals(entry.getFirstName(), name1);
    }

    @Test
    void test2SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "James";
        entry.setFirstName(name1);
        assertEquals(entry.getFirstName(), name1);
    }

    @Test
    void test1GetFirstName() {
        AddressEntry entry = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getFirstName(), "John");
    }

    @Test
    void test2GetFirstName() {
        AddressEntry entry = new AddressEntry("Lex", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getFirstName(), "Lex");
    }

    @Test
    void setLastName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setCity() {
    }

    @Test
    void getCity() {
    }

    @Test
    void setState() {
    }

    @Test
    void getState() {
    }

    @Test
    void setStreet() {
    }

    @Test
    void getStreet() {
    }

    @Test
    void setZip() {
    }

    @Test
    void getZip() {
    }

    @Test
    void setPhone() {
    }

    @Test
    void getPhone() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getEmail() {
    }
}