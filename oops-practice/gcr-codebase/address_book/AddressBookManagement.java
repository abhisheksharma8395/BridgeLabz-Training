

import java.util.ArrayList;
import java.util.List;

public class AddressBookManagement {
    List<AddressBook> addressBooks = new ArrayList<>();

    // UC - 06
    // This method is used to add new Address Book
    public void addAddressBook(AddressBook addressBook){
        addressBooks.add(addressBook);
        System.out.println("Address Book Added Successfully");
    }
}
