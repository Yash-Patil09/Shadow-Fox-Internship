import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> viewContacts() {
        return contacts;
    }

    public boolean updateContact(String name, String newPhoneNumber, String newEmail) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }
}
