// Anthony Vigil
// CS-320: Software Test Automation & QA
// Module Three 

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modulethree.Contact;
import modulethree.ContactService;

public class ContactServiceTest {

// Test Adding Contact 
@Test
public void testAdd()
{
ContactService cs = new ContactService();
Contact test1 = new Contact("1032948", "Durin", "IV", "9273509748", "Drawf Mountain");
assertEquals(true, cs.addContact(test1));
}

// Test Deleting Contact
@Test
public void testDelete()
{
ContactService cs = new ContactService();

Contact test1 = new Contact("1032948", "Durin", "IV", "9273509748", "Drawf Mountain");
Contact test2 = new Contact("1102403", "Elrond", "Sindarin", "2404097854", "Rivendell");
Contact test3 = new Contact("9129371", "Gandalf", "Olorin", "9820346857", "Middle Earth");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.deleteContact("1102403"));
assertEquals(false, cs.deleteContact("1102404"));
assertEquals(false, cs.deleteContact("1102404"));
}

// Test Updating Contact
@Test
public void testUpdate()
{
ContactService cs = new ContactService();

Contact test1 = new Contact("1032948", "Durin", "IV", "9273509748", "Drawf Mountain");
Contact test2 = new Contact("1102403", "Elrond", "Sindarin", "2404097854", "Rivendell");
Contact test3 = new Contact("9129371", "Gandalf", "Olorin", "9820346857", "Middle Earth");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.updateContact("9129371", "Gandalf", "Olorin", "9820346857", "Middle Earth"));
assertEquals(false, cs.updateContact("9128760", "Gandalf", "Olorin", "9820346857", "Middle Earth"));
}

}
