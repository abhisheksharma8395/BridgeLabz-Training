import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManagement {
    // Instance Variable
    List<AddressBook> addressBooks = new ArrayList<>();                                    // List of Address Books
    AddressBook currentAddressBook;                                                        // Stores the current address book


    // UC - 06
    // This method is used to add new Address Book
    public void addAddressBook(String name) {
        boolean flag = true;
        for(AddressBook addressBook : addressBooks){
            if(addressBook.nameOfAddressBook.equals(name)){
                flag = false;
            }
        }
        if(flag){
            AddressBook addressBook = new AddressBook(name);
            currentAddressBook = addressBook;
            addressBooks.add(addressBook);
            System.out.println("Address Book Added Successfully");
        }
        else{
            System.out.println("An Address Book with this name is already exists");
        }

    }


    // This method is used to perform all operations
    public void performOperations() {
        // Creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        boolean stopper = false;
        while (!stopper) {
            System.out.println("Select the Operation you want to perform : ");
            System.out.println(" 1 For Creating the Address Book : ");
            System.out.println(" 2 For Adding Contact in Address Book : ");
            System.out.println(" 3 For Editing Contact using the first name : ");
            System.out.println(" 4 For Deleting Contact using the first name : ");
            System.out.println(" 5 For Displaying the contacts City-wise : ");
            System.out.println(" 6 For Displaying the contacts of a specific city : ");
            System.out.println(" 7 For Displaying the contacts State-wise : ");
            System.out.println(" 8 For Displaying the contacts of a specific state : ");
            System.out.println(" 9 For Displaying the count of contacts City-wise : ");
            System.out.println(" 10 For Displaying the count of the contacts of a specific city : ");
            System.out.println(" 11 For Displaying the count of contacts State-wise : ");
            System.out.println(" 12 For Displaying  the count of contacts of a specific state : ");
            System.out.println(" 13 For Sorting the Address Book on the basis of First Name : ");
            System.out.println(" 14 For Sorting the Address Book on the basis of City Name : ");
            System.out.println(" 15 For Sorting the Address Book on the basis of State Name : ");
            System.out.println(" 16 For Sorting the Address Book on the basis of Zip code :");
            System.out.println(" 17 For Reading the file using File IO : ");
            System.out.println(" 18 For Writing the file using File IO : ");
            System.out.println(" 19 For Reading the file using open csv library : ");
            System.out.println(" 20 For Writing the file using open csv library : ");
            System.out.println(" 21 For Reading the JSON file using google gson library : ");
            System.out.println(" 22 For Writing the JSON file using google gson library : ");
            System.out.println(" 23 For Exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String name = scanner.next();
                    this.addAddressBook(name);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                default:


            }
        }
    }
}
