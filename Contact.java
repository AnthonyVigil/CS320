// Anthony Vigil
// CS-320: Software Test Automation & QA
// Module Three 


package modulethree;

public class Contact {
	
	// String for objects
	String contactID;
	String firstName;
	String lastName;
	String Number;
	String Address;
	
// Contact
public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
	super();
	
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.Number = Number;
	this.Address = Address;
}

//Getting string for ContactID
public String getContactID() {
	return contactID;
}

//Setting string for ContactID
public void setContactID(String contactID) {
	this.contactID = contactID;
}

//Getting string for firstName
public String getFirstName() {
	return firstName;
}

// Setting string for firstName
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

// Getting string for lastName
public String getLastName() {
	return lastName;
}

// Setting string for lastName
public void setLastName(String lastName) {
	this.lastName = lastName;
}

// Getting string phoneNumber 
public String getNumber() {
	return Number;
}

// Setting string to phoneNumber
public void setNumber(String Number) {
	this.Number = Number;
}

// Getting string for address
public String getAddress() {
	return Address;
}

// Setting string for address
public void setAddress(String Address) {
	this.Address = Address;
}

// Return the string
@Override
public String toString() {
	return "Contact[contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", Number=" + Number + ", Address=" + Address + "]";
}

}

