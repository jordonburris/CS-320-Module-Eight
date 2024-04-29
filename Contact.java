public class Contact {
	private String firstName;
	private String lastName;
	private String pNumber;
	private String address;
	private String contactId;

	
	public void setContactId(String contactId) {
		if (contactId == null || contactId.length() > 10) {
		throw new IllegalArgumentException("Invalid contact ID");
		}
		this.contactId = contactId;
	}
	
	public void setfirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Invalid contact First Name");
		}
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Invalid contact Last Name");
		}
		this.lastName = lastName;
	}
	
	public void setpNumber(String pNunber) {
		if (pNumber == null || pNumber.length() > 10) {
		throw new IllegalArgumentException("Invalid contact number");
		}
		this.pNumber = pNumber;
	}
	
	public void setaddress(String address) {
		if (address == null || address.length() > 30) {
		throw new IllegalArgumentException("Invalid contact address");
		}
		this.address= address;
	}
	
	public String getcontactId() {
		return contactId;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getpNumber() {
		return pNumber;
	}
	public String getaddress() {
		return address;
	}
}
