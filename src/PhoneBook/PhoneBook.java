package PhoneBook;

import javax.swing.*;
import java.util.ArrayList;

public class PhoneBook {
    private String contactName;
    private ArrayList<Contact> contactList;
    private String passcode;

    public PhoneBook(String contactName, String passcode) {
        this.contactName = contactName;
        this.passcode = passcode;
        contactList = new ArrayList<>();

    }


    public void changePasscode(String passcode) {
        this.passcode = passcode;


    }

    public boolean validatePassCode(String passcode) {
        return this.passcode == passcode;
    }
    //  public final void searchContact(Contact contact){
    //     for(int i=0;i<contact)



    public void addContact(Contact contact) {
        // final int NO_OF_NUMBERS_THAT_CAN_BE_ADDED = 0+;
        if (contactList.size() > 0) {
            contactList.add(contact);
            System.out.println("you have successfully added your contact");
        } else {
            throw new RuntimeException("You cannot add more than 5 contacts at once");
        }
    }
    public String deleteContact(Contact contact){
        try {
            contactList.remove(contact);
        }
        catch (RuntimeException e){
            System.out.println(e);
            System.out.println("YOU CAN NOT REMOVE MORE THAN FIVE CONTACTS AT ONCE");
        }
        return "successfully deleted";

    }



}
