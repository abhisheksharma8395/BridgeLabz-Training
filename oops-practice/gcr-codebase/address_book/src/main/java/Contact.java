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

    // This method is used to display the Contact object details
    public void display(){
        System.out.println("First Name : "+this.firstName);
        System.out.println("Last Name : "+this.lastName);
        System.out.println("Address : "+this.address);
        System.out.println("City : "+this.city);
        System.out.println("State : "+this.state);
        System.out.println("Zip code : "+this.zip);
        System.out.println("Phone Number : "+this.phoneNumber);
        System.out.println("Email : "+this.email);
    }
}
