package in.abc.bean;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {

	private Set<Long> phoneNumbers;
	private Set<Date> dates;
	
	static {
		System.out.println("ContactInfo.class file is loading...");
	}
	
	public ContactsInfo(Set<Long> phoneNumbers, Set<Date> dates) {
		System.out.println("Parameterized constructor got called...");
		this.phoneNumbers = phoneNumbers;
		this.dates = dates;
		System.out.println(phoneNumbers.getClass());
	}

	@Override
	public String toString() {
		return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}
	
		
	
}
