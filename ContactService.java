// Anthony Vigil
// CS-320: Software Test Automation & QA
// Module Three

package modulethree;

import java.util.ArrayList;

public class ContactService {

	// Array of Contacts
	private ArrayList<Contact> contacts;

	public ContactService() {

		// Call Array
		contacts = new ArrayList<>();
	}

	// Set Contact to get all values
	public boolean addContact(Contact contact) {
		boolean contactAlready = false;

		// Go through all in the list
		for (Contact contactList : contacts) {
			// Check to see if the contact already exists
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		// Adds contact when it does not exist
		if (!contactAlready) {
			contacts.add(contact);
			
			// Statement true after adding contact
			return true;
		} else {
			return false;
		}
	}

	// Delete Contact 
	public boolean deleteContact(String contactID) {
		// Checks list
		for (Contact contactList : contacts) {
			
			// If finds a match, deletes and returns to remove
			if (contactList.getContactID().equals(contactID)) {
				
				// Returns remove as true
				contacts.remove(contactList);
				return true;
			}
		}
		
		// Returns false if does not exist and not removed
		return false;
	}

	// Update if changes made, if not, do not update
	public boolean updateContact(String contactID, String firstName, String lastName, String Number,
			String Address) {
		
		// For loop through contact list
		for (Contact contactList : contacts) {
			
			// Finds matching ID in contact list
			if (contactList.getContactID().equals(contactID)) {
				
				// If first name is equal to a first name in the list
				if (!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirstName(firstName);
				}
				
				// If last name is equal to a last name in the list
				if (!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setFirstName(lastName);
				}
				
				// If phone number is equal to a phone number in the list
				if (!Number.equals("") && (Number.length() == 10)) {
					contactList.setFirstName(Number);
				}
				
				// If address is equal to an address on the list
				if (!Address.equals("") && !(Address.length() > 30)) {
					contactList.setFirstName(Address);
				}
				return true;
			}
		}

		// Returns false if not found and not updated
		return false;
	}
}
