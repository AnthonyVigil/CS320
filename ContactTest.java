// Anthony Vigil
// CS-320: Software Test Automation & QA
// Module Three 


package test;

import org.junit.jupiter.api.Test;

import modulethree.Contact;

import static org.junit.jupiter.api.Assertions.*;

// Created ContactTest class
class ContactTest {
	
	// Make object as class
    Contact contact = new Contact("1", "firstName", "lastName", "987654321", "213 Lamar Blvd");

    
    // Test getting contact ID
    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }

    // Test getting first name
    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    // Test getting last name
    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    // Test getting phone number
    @Test
    void getNumber() {
        assertEquals("987654321", contact.getNumber());
    }

    // Test getting address
    @Test
    void getAddress() {
        assertEquals("213 Lamar Blvd", contact.getAddress());
    }

    // Test to the string we got
    @Test
    void testToString() {
        assertEquals("Contact[contactID=1, firstName=firstName, lastName=lastName, Number=987654321, Address=213 Lamar Blvd]", contact.toString());
    }

}