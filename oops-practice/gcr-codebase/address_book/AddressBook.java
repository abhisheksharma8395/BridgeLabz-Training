import javax.print.attribute.standard.Chromaticity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> addressBook = new ArrayList<>();


    // UC - 01
    // This method is used to add the contact
    public void addContact(Contact contact){
        if(isValid(contact)) {
            addressBook.add(contact);
            System.out.println("Added Contact Successfully");
        }
        System.out.println("Contact Already Stored");
        System.out.println("Duplicate Entries");
    }

    // UC - 02
    // This method is used to add the contact after taking console input from user
    public void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name of Contact : ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the Last Name of Contact : ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Address of Contact : ");
        String address = scanner.nextLine();
        System.out.println("Enter the City Name of Contact : ");
        String city = scanner.nextLine();
        System.out.println("Enter the State Name of Contact : ");
        String state = scanner.nextLine();
        System.out.println("Enter the Zip number of Contact : ");
        String zip = scanner.nextLine();
        System.out.println("Enter the Phone Number of Contact : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the Email of Contact : ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        addressBook.add(newContact);
        System.out.println("Added Contact Successfully");
    }

    // UC - 03
    public void editContact(String name){

    }

    // UC - 04
    public void deleteContact(String name){

    }

    // UC - 05
    // This method is used to add Multiple contact in address book
    public void addMultiplePerson(List<Contact> contacts){
        for(Contact contact : contacts){
            addContact(contact);
        }
    }

    // UC - 07
    public boolean isValid(Contact contact){
        if(addressBook.contains(contact)){
            return false;
        }
        return true;
    }
}
