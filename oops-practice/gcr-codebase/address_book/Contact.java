package address_book;

public class Contact {
    String firstName;                                                             // Stores the First Name of contact
    String lastName;                                                              // Stores the Last Name of contact
    String address;                                                               // Stores the Address of contact
    String city;                                                                  // Stores the City Name of contact
    String state;                                                                 // Stores the State Name of contact
    String zip;                                                                   // Stores the zip number of contact
    String phoneNumber;                                                           // Stores the PhoneNumber of contact
    String email;                                                                 // Stores the Email of contact

    // Constructor of Contact class to initialize instance variables
    public Contact(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
