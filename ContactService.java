import java.util.ArrayList;
public class ContactService {
	
	public static String contactId;
	public String publicfirstName;
	public String publiclastName;
	public String publicpNumber;
	public String publicaddress;
	//array for contact list
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	//add contact function to array
	public static void addContact(Contact newContact) {
		String tempId = newContact.getId();
		for (int i = 0; i < contactList.size(); i++) {
			if (tempId.equals(contactList.get(i).getId())) {
				throw new IllegalArgumentException("Contact ID Must Be Unique");
			}
		}
		contactList.add(newContact);
	}
	//updater for first name
	public static void updateFirstName(String uniqueId, String publicFirstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setfirstName(publicFirstName);
			}
		}
	}
	//updater for last name
	public static void updateLastName(String uniqueId, String publicLastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setlastName(publicLastName);
			}
		}
	}
	//updater for phone number
	public static void updatePhoneNum(String uniqueId, String publicPhone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setpNumber(publicPhone);
			}
		}
	}
	//updater for address
	public static void updateAddress(String uniqueId, String publicAddress) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setaddress(publicAddress);
			}
		}
	}
	//delete contact
	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				int position = i;
				contactList.remove(position);
			}
		}
	}
}
