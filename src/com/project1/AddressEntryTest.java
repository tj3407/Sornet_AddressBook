package com.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to test AddressEntry class
 */
class AddressEntryTest {
    /**
     * 1st test for toString method in AddressEntry
     */
    @Test
    void testToString() {
    }

    /**
     * 1st test for setFirstName method in AddressEntry
     */
    @Test
    void test1SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "John";
        entry.setFirstName(name1);
        assertEquals(entry.getFirstName(), name1);
    }

    /**
     * 2nd test for setFirstName method in AddressEntry
     */
    @Test
    void test2SetFirstName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "James";
        entry.setFirstName(name1);
        assertEquals(entry.getFirstName(), name1);
    }

    /**
     * 1st test for getFirstName method in AddressEntry
     */
    @Test
    void test1GetFirstName() {
        AddressEntry entry = new AddressEntry("John", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getFirstName(), "John");
    }

    /**
     * 2nd test for getFirstName method in AddressEntry
     */
    @Test
    void test2GetFirstName() {
        AddressEntry entry = new AddressEntry("Lex", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getFirstName(), "Lex");
    }

    /**
     * 1st test for setLastName method in AddressEntry
     */
    @Test
    void test1SetLastName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "Doe";
        entry.setLastName(name1);
        assertEquals(entry.getLastName(), name1);
    }

    /**
     * 2nd test for setLastName method in AddressEntry
     */
    @Test
    void test2SetLastName() {
        AddressEntry entry = new AddressEntry();
        String name1 = "Keaton";
        entry.setLastName(name1);
        assertEquals(entry.getLastName(), name1);
    }

    /**
     * 1st test for getLastName method in AddressEntry
     */
    @Test
    void test1GetLastName() {
        AddressEntry entry = new AddressEntry("Lex", "Doe", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getLastName(), "Doe");
    }

    /**
     * 2nd test for getLastName method in AddressEntry
     */
    @Test
    void test2GetLastName() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getLastName(), "Keaton");
    }

    /**
     * 1st test for setCity method
     */
    @Test
    void test1SetCity() {
        AddressEntry entry = new AddressEntry();
        String city1 = "Hayward";
        entry.setCity(city1);
        assertEquals(entry.getCity(), city1);
    }

    /**
     * 2nd test for setCity method
     */
    @Test
    void test2SetCity() {
        AddressEntry entry = new AddressEntry();
        String city2 = "San Francisco";
        entry.setCity(city2);
        assertEquals(entry.getCity(), city2);
    }

    /**
     * 1st test for getCity method
     */
    @Test
    void test1GetCity() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getCity(), "Hayward");
    }

    /**
     * 2nd test for getCity method
     */
    @Test
    void test2GetCity() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Chicago", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getCity(), "Chicago");
    }

    /**
     * 1st test for setState method
     */
    @Test
    void test1SetState() {
        AddressEntry entry = new AddressEntry();
        String state1 = "WY";
        entry.setState(state1);
        assertEquals(entry.getState(), state1);
    }

    /**
     * 2nd test for setState method
     */
    @Test
    void test2SetState() {
        AddressEntry entry = new AddressEntry();
        String state2 = "GA";
        entry.setState(state2);
        assertEquals(entry.getState(), state2);
    }

    /**
     * 1st test for getState method
     */
    @Test
    void test1GetState() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getState(), "CA");
    }

    /**
     * 2nd test for getState method
     */
    @Test
    void test2GetState() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission", "Miami", "FL", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getState(), "FL");
    }

    /**
     * 1st test for setStreet method
     */
    @Test
    void test1SetStreet() {
        AddressEntry entry = new AddressEntry();
        String street1 = "Main St";
        entry.setStreet(street1);
        assertEquals(entry.getStreet(), street1);
    }

    /**
     * 2nd test for setStreet method
     */
    @Test
    void test2SetStreet() {
        AddressEntry entry = new AddressEntry();
        String street2 = "Hesperian Blvd";
        entry.setStreet(street2);
        assertEquals(entry.getStreet(), street2);
    }

    /**
     * 1st test for getStreet method
     */
    @Test
    void test1GetStreet() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getStreet(), "Mission Blvd");
    }

    /**
     * 2nd test for getStreet method
     */
    @Test
    void test2GetStreet() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Carlos Bee", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getStreet(), "Carlos Bee");
    }

    /**
     * 1st test for setZip method
     */
    @Test
    void test1SetZip() {
        AddressEntry entry = new AddressEntry();
        int zip1 = 94544;
        entry.setZip(zip1);
        assertEquals(entry.getZip(), zip1);
    }

    /**
     * 2nd test for setZip method
     */
    @Test
    void test2SetZip() {
        AddressEntry entry = new AddressEntry();
        int zip2 = 95035;
        entry.setZip(zip2);
        assertEquals(entry.getZip(), zip2);
    }

    /**
     * 1st test for getZip method
     */
    @Test
    void test1GetZip() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getZip(), 94544);
    }

    /**
     * 2nd test for getZip method
     */
    @Test
    void test2GetZip() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 30454, "444-444-4444", "test@test.com");
        assertEquals(entry.getZip(), 30454);
    }

    /**
     * 1st test for setPhone method
     */
    @Test
    void test1SetPhone() {
        AddressEntry entry = new AddressEntry();
        String phone1 = "510-510-4444";
        entry.setPhone(phone1);
        assertEquals(entry.getPhone(), phone1);
    }

    /**
     * 2nd test for setPhone method
     */
    @Test
    void test2SetPhone() {
        AddressEntry entry = new AddressEntry();
        String phone2 = "408-408-6789";
        entry.setPhone(phone2);
        assertEquals(entry.getPhone(), phone2);
    }

    /**
     * 1st test for getPhone method
     */
    @Test
    void test1GetPhone() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "444-444-4444", "test@test.com");
        assertEquals(entry.getPhone(), "444-444-4444");
    }

    /**
     * 2nd test for getPhone method
     */
    @Test
    void test2GetPhone() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "343-343-2312", "test@test.com");
        assertEquals(entry.getPhone(), "343-343-2312");
    }

    /**
     * 1st test for setEmail method
     */
    @Test
    void test1SetEmail() {
        AddressEntry entry = new AddressEntry();
        String email1 = "test@test.com";
        entry.setEmail(email1);
        assertEquals(entry.getEmail(), email1);
    }

    /**
     * 2nd test for setEmail method
     */
    @Test
    void test2SetEmail() {
        AddressEntry entry = new AddressEntry();
        String email2 = "john@doe.com";
        entry.setEmail(email2);
        assertEquals(entry.getEmail(), email2);
    }

    /**
     * 1st test for getEmail method
     */
    @Test
    void test1GetEmail() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "343-343-2312", "test@test.com");
        assertEquals(entry.getEmail(), "test@test.com");
    }

    /**
     * 2nd test for getEmail method
     */
    @Test
    void test2GetEmail() {
        AddressEntry entry = new AddressEntry("Lex", "Keaton", "Mission Blvd", "Hayward", "CA", 94544, "343-343-2312", "lex@keaton.com");
        assertEquals(entry.getEmail(), "lex@keaton.com");
    }
}