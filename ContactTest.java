import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	@Test
	void testContactClass() {
		Contact newContact = new Contact("1000", "Mike", "Smith", "6382946672", "123 West St. Hollywood, CA 10001");
		assertTrue(newContact.getfirstName().equals("Mike"));
		assertTrue(newContact.getlastName().equals("Smith"));
		assertTrue(newContact.getcontactId().equals("1000"));
		assertTrue(newContact.getpNumber().equals("6382946672"));
		assertTrue(newContact.getaddress().equals("123 West St. Hollywood, CA 10001"));
	}
	
}
