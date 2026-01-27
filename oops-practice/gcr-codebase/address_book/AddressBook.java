import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class AddressBook {
    List<Contact> addressBook = new ArrayList<>();
    HashMap<String, List<Contact>> cityAndPerson = new HashMap<>();      // Stores the list of person of a specific city
    HashMap<String, List<Contact>> stateAndPerson = new HashMap<>();      // Stores the list of person of a specific State

    // UC - 01
    // This method is used to add the contact
    public void addContact(Contact contact) {
        if (isValid(contact)) {
            addressBook.add(contact);
            if (cityAndPerson.containsKey(contact.city)) {
                cityAndPerson.get(contact.city).add(contact);
            } else {
                cityAndPerson.put(contact.city, new ArrayList<>());
                cityAndPerson.get(contact.city).add(contact);
            }
            if (stateAndPerson.containsKey(contact.state)) {
                stateAndPerson.get(contact.state).add(contact);
            } else {
                stateAndPerson.put(contact.state, new ArrayList<>());
                stateAndPerson.get(contact.state).add(contact);
            }
            System.out.println("Added Contact Successfully");
        }
        System.out.println("Contact Already Stored");
        System.out.println("Duplicate Entries");
    }

    // UC - 02
    // This method is used to add the contact after taking console input from user
    public void addContact() {
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

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(newContact);
        System.out.println("Added Contact Successfully");
    }

    // UC - 03
    public void editContact(String firstName) {
        boolean flag = false;
        Contact tempContact = null;
        for(Contact contact : this.addressBook){
            if(contact.firstName.equals(firstName)) {
                tempContact = contact;
                flag = true;
            }
        }
        if(flag){
            Scanner scanner = new Scanner(System.in);
            boolean stopper = false;
            while(!stopper) {
                System.out.println("Enter the thing you want to update ");
                System.out.println(" 1 for Updating First Name Which is currently : "+tempContact.firstName);
                System.out.println(" 2 for Updating Last Name Which is currently : "+tempContact.lastName);
                System.out.println(" 3 for Updating Address Which is currently : "+tempContact.address);
                System.out.println(" 4 for Updating City Name Which is currently : "+tempContact.city);
                System.out.println(" 5 for Updating State Name Which is currently : "+tempContact.state);
                System.out.println(" 6 for Updating Zip code Which is currently : "+tempContact.zip);
                System.out.println(" 7 for Updating Phone Number Which is currently : "+tempContact.phoneNumber);
                System.out.println(" 8 for Updating Email Which is currently : "+tempContact.email);
                System.out.println(" 9 for Exit ");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1 :
                        String fName = scanner.next();
                        tempContact.firstName = fName;
                        System.out.println("Successfully Updated the First Name");
                        break;
                    case 2 :
                        String lastName = scanner.next();
                        tempContact.lastName = lastName;
                        System.out.println("Successfully Updated the Last Name");
                        break;
                    case 3 :
                        String address = scanner.nextLine();
                        tempContact.address = address;
                        System.out.println("Successfully Updated the Address");
                        break;
                    case 4 :
                        String city = scanner.nextLine();
                        tempContact.city = city;
                        System.out.println("Successfully Updated the city");
                        break;
                    case 5 :
                        String state = scanner.nextLine();
                        tempContact.state = state;
                        System.out.println("Successfully Updated the state");
                        break;
                    case 6 :
                        String zip = scanner.next();
                        tempContact.zip = zip;
                        System.out.println("Successfully Updated the zip");
                        break;
                    case 7 :
                        String phoneNumber = scanner.next();
                        tempContact.phoneNumber = phoneNumber;
                        System.out.println("Successfully Updated the Phone Number");
                        break;
                    case 8 :
                        String email = scanner.next();
                        tempContact.email = email;
                        System.out.println("Successfully Updated the First Email");
                        break;
                    case 9 :
                        stopper = true;
                        System.out.println("Exited Successfully");
                        break;
                    default :
                        System.out.println("Invalid Input");
                }
            }
            System.out.println("The Details of Contact with First name "+firstName+" updated successfully.");
        }
        else System.out.println("Unable to find the contact with First Name "+firstName);
    }

    // UC - 04
    // This method is used to remove the person based on the first Name from the address book
    public void deleteContact(String firstName) {
        boolean flag = false;
        for(Contact contact : this.addressBook){
            if(contact.firstName.equals(firstName)) {
                this.addressBook.remove(contact);
                flag = true;
            }
        }
        if(flag) System.out.println("The Contact with First name "+firstName+" removed successfully.");
        else System.out.println("Unable to find the contact with First Name "+firstName);
    }

    // UC - 05
    // This method is used to add Multiple contact in address book
    public void addMultiplePerson(List<Contact> contacts) {
        for (Contact contact : contacts) {
            addContact(contact);
        }
    }

    // UC - 07
    public boolean isValid(Contact contact) {
        if (addressBook.contains(contact)) {
            return false;
        }
        return true;
    }

    // UC - 09
    // This method is used to print the person of a specific city
    public void viewByCity(String city) {
        System.out.println("City Name : " + city);
        for (Contact contact : cityAndPerson.get(city)) {
            contact.display();
        }
    }

    // This method display the all city and person record
    public void viewByCity() {
        for (String city : cityAndPerson.keySet()) {
            System.out.println("City Name : " + city);
            for (Contact contact : cityAndPerson.get(city)) {
                contact.display();
            }
        }
    }

    // This method is used to print the person of a specific state
    public void viewByState(String state) {
        System.out.println("State Name : " + state);
        for (Contact contact : stateAndPerson.get(state)) {
            contact.display();
        }
    }

    // This method display the all state and person record
    public void viewByState() {
        for (String state : stateAndPerson.keySet()) {
            System.out.println("State Name : " + state);
            for (Contact contact : stateAndPerson.get(state)) {
                contact.display();
            }
        }
    }


    // UC - 10
    // This method is used to print the count of person in a specific city
    public void countByCity(String city) {
        System.out.println("City Name -> Count of Person ");
        System.out.println(city+" -> "+cityAndPerson.get(city).size());
    }

    // This method display the count of person in cities
    public void countByCity() {
        for (String city : cityAndPerson.keySet()) {
            System.out.println("City Name -> Count of Person ");
            System.out.println(city+" -> "+cityAndPerson.get(city).size());
        }
    }

    // This method is used to print count of person in a specific state
    public void countByState(String state) {
        System.out.println("State Name -> Count of Person ");
        System.out.println(state+" -> "+stateAndPerson.get(state).size());
    }

    // This method display the count of person in states
    public void countByState() {
        for (String state : stateAndPerson.keySet()) {
            System.out.println("State Name -> Count of Person ");
            System.out.println(state+" -> "+stateAndPerson.get(state).size());
        }
    }

    // UC - 11
    // this method is used to sort the addressBook on the basis of Contact's First Name
    public void sortByName(){
        Collections.sort(addressBook,Comparator.comparing(p -> p.firstName));
    }

    // UC - 12
    // these following methods is used to sort the addressBook on the basis of Contact's City Name , State Name , Zip
    public void sortByCity(){
        Collections.sort(addressBook,Comparator.comparing(p -> p.city));
    }

    public void sortByState(){
        Collections.sort(addressBook,Comparator.comparing(p -> p.state));
    }

    public void sortByZip(){
        Collections.sort(addressBook,Comparator.comparing(p -> p.zip));
    }

    // UC-13
    // This method is used to Reading the input from file Using file IO
    public void readFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/contactDetails.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            // Reading Header
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] column = line.split(",");
                String firstName = column[0];
                String lastName = column[1];
                String address = column[2];
                String city = column[3];
                String state = column[4];
                String zip = column[5];
                String phoneNumber = column[6];
                String email = column[7];
                Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
                this.addressBook.add(contact);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    // This method is used to Writing the input to file using file IO
    public void writeFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/contactDetails.csv";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            // Reading Header
            bufferedWriter.write("First Name, Last Name, Address, City, State, Zip, Phone Number, Email");
            for(Contact contact : this.addressBook){
                bufferedWriter.write(contact.firstName+","+contact.lastName+","+contact.address+","+contact.city+","+contact.state+","+contact.zip+","+contact.phoneNumber+","+contact.email);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // UC-14
    // This method is used to Reading the input from file Using file CSVReader
    public void readCSVFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/contactDetails.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Reading Header
            reader.readNext();
            String[] column;
            while((column = reader.readNext())!=null){
                String firstName = column[0];
                String lastName = column[1];
                String address = column[2];
                String city = column[3];
                String state = column[4];
                String zip = column[5];
                String phoneNumber = column[6];
                String email = column[7];
                Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
                this.addressBook.add(contact);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    // This method is used to Writing the input to file using CSVWriter
    public void writeCSVFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/contactDetails.csv";
        try(CSVWriter bufferedWriter = new CSVWriter(new FileWriter(filePath))) {
            String[] header = new String[]{"First Name", "Last Name", "Address", "City", "State", "Zip", "Phone Number", "Email"};
            // Writing Header
            bufferedWriter.writeNext(header);
            for(Contact contact : this.addressBook){
                String[] row = new String[]{contact.firstName,contact.lastName,contact.address,contact.city,contact.state,contact.zip,contact.phoneNumber,contact.email};
                bufferedWriter.writeNext(row);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // UC-15
    // This method is used to Reading the input from JSON file Using gson library
    public void readJSONFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/personDetails.json";
        Gson gson = new Gson();
        FileReader reader = new FileReader(filePath);
        Contact[] contacts  = gson.fromJson(reader, Contact[].class);
        if(contacts != null) this.addMultiplePerson(Arrays.asList(contacts));
    }


    // This method is used to Writing the input to JSON file using gson library
    public void writeJSONFile() throws IOException {
        String filePath = "oops-practice/gcr-codebase/address_book/personDetails.json";
        FileWriter writer = new FileWriter(filePath);
        Gson gson = new Gson();
        gson.toJson(this.addressBook,writer);
    }
}
