package com.project1;

/**
 * Class that represents a single object entry in the AddressBook class
 * Overrides a toString() method that prints out all the data of an entry
 * and contains getters and setters to set and retrieve individual AddressEntry
 * values.
 */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * Constructors (default and custom)
     */
    AddressEntry() {}

    AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Method to override toString
     * @return a String containing details of a single AddressEntry
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" +
                street + "\n" +
                city + ", " + state + " " + zip + "\n" +
                email + "\n" +
                phone + "\n";
    }

    /**
     * Method to set first name of an Address Entry object
     * @param firstName a String of a person's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method to retrieve first name of an Address Entry object
     * @return a String of an AddressEntry's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to set last name of an Address Entry object
     * @param lastName a String of a person's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method to retrieve last name of an Address Entry object
     * @return a String of an AddressEntry's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to set city of an Address Entry object
     * @param city a String containing city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Method to retrieve city name of an Address Entry object
     * @return a String of an AddressEntry's city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Method to set state of an Address Entry object
     * @param state a String containing state value
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Method to retrieve state of an Address Entry object
     * @return a String of an AddressEntry's state value
     */
    public String getState() {
        return state;
    }

    /**
     * Method to set street name of an Address Entry object
     * @param street a String containing street name
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Method to retrieve street name of an Address Entry object
     * @return a String of an AddressEntry's street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Method to set zip code of an Address Entry object
     * @param zip an integer containing zip value
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Method to retrieve zip code of an Address Entry object
     * @return a String of an AddressEntry's zip code
     */
    public int getZip() {
        return zip;
    }

    /**
     * Method to set phone of an Address Entry object
     * @param phone a String of a person's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Method to retrieve phone of an Address Entry object
     * @return a String of an AddressEntry's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Method to set email of an Address Entry object
     * @param email a String of a person's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method to retrieve email of an Address Entry object
     * @return a String of an AddressEntry's email
     */
    public String getEmail() {
        return email;
    }
}

