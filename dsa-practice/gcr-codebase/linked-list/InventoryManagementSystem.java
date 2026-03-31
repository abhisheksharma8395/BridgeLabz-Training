// This program is used to manage student records using a singly linked list
public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Creating the object of InventoryManager class
        InventoryManager list = new InventoryManager();

        // Creating 6 Nodes
        ItemNode item1 = new ItemNode("Cricket Ball", "XA0QWE", 20, 250);
        ItemNode item2 = new ItemNode("Cricket Bat", "PR7NMF", 15, 1800);
        ItemNode item3 = new ItemNode("Football", "EM1PTS", 25, 1100);
        ItemNode item4 = new ItemNode("Volleyball", "UY4FDM", 10, 800);
        ItemNode item5 = new ItemNode("Hockey Bat", "UJ4NHU", 6, 1350);
        ItemNode item6 = new ItemNode("Cricket Kit", "AO8HRP", 4, 4200);

        // Connecting the Nodes
        list.addAtEnd(item1);
        list.addAtEnd(item2);
        list.addAtBeginning(item3);
        list.addAtIndex(item4, 1);
        list.addAtIndex(item5, 3);
        list.addAtBeginning(item6);

        // Searching the Item Record by using Item ID
        list.searchByItemID("AO8HRP");

        // Searching the Item by using Item Name
        list.searchByItemName("Hockey Bat");

        // Displaying the details of all students
        list.display();

        // Deleting the record by using the roll number
        list.deleteByItemId("UY4FDM");

        // Displaying the details of all students after deleting some records
        list.display();

        // display the total value of inventory
        list.totalValue();

        // Sorting the list
        list.sortList();

        //Display list after sorting
        list.display();
    }

}

// StudentNode Class that represents what value a node store of singly linked list
class ItemNode {
    String itemName;                             // Stores Name of item
    String itemID;                                // Stores item id of item
    int quantity;                                    // Stores quantity of item
    int price;                                  // Stores the price of item
    ItemNode next;

    // Constructor of StudentNode class to initialize variables
    ItemNode(String itemName, String itemID, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemID = itemID;
        this.price = price;
        next = null;
    }
}

class InventoryManager {
    ItemNode head = null;
    ItemNode tail = null;
    int size = 0;                              // Stores the  current size of linked list

    // This Method Stores the Item record at the Beginning of the Linked List
    public void addAtBeginning(ItemNode item) {
        item.next = head;
        head = item;
        size++;
    }

    // This Method Stores the Item record at the end of the Linked List
    public void addAtEnd(ItemNode item) {
        if (head == null) {                                // If list is currently empty then it we add first element in list
            head = tail = item;
        } else {
            tail.next = item;
            tail = item;
        }
        size++;
    }


    // This Method add Item Record on a specific Index
    public void addAtIndex(ItemNode item, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {
            ItemNode temp = head;
            if (index == 0) {
                addAtBeginning(item);
            } else if (index == size) {
                addAtEnd(item);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                item.next = temp.next;
                temp.next = item;
                size++;
            }
        }
    }

    // This Method delete item record on the basis of item ID
    public void deleteByItemId(String itemID) {
        ItemNode temp = head;
        if (head == null) {                                                     // Checks if the head is null or not
            System.err.println("Empty List");
        } else {                                                                 // Checks if the element at head have to delete or not
            if (head.itemID.equals(itemID)) {
                deleteAtHead();
                size--;
            } else {                                                                          // other element delete except head
                while ((temp.next != null) && !(temp.next.itemID.equals(itemID))) {
                    temp = temp.next;
                }
                if (temp.next == null) {                                                      // If user entered roll number not found in the list then this text displayed
                    System.err.println("Record not found");
                } else {                                                       // Deleting the record who have the same roll number we want to delete
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    temp.next = temp.next.next;
                    size--;
                }
            }
        }

    }

    // This method deletes the record from the head of the list
    private void deleteAtHead() {
        try {
            head = head.next;
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

    // This method search for item Record by using item ID
    public void searchByItemID(String itemID) {
        ItemNode temp = head;
        while (temp != null && !temp.itemID.equals(itemID)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Item Record found with this Item ID . ");
        } else {
            System.out.println("Item Record found with this item id ");
            System.out.println("Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Price : " + temp.price);
            System.out.println("quantity : " + temp.quantity);
            System.out.println("__________________________________________________");
        }
    }


    // This method search the item by using item name
    public void searchByItemName(String itemName) {
        ItemNode temp = head;
        while (temp != null && !temp.itemName.equals(itemName)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Item Record found with this Item Name . ");
        } else {
            System.out.println("Item Record found with Item Name " + itemName);
            System.out.println("Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Price : " + temp.price);
            System.out.println("quantity : " + temp.quantity);
            System.out.println("__________________________________________________");
        }
    }

    // This Method Calculate the total value of Inventory
    public void totalValue() {
        double total = 0.0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Value Of Inventory : " + total);
        System.out.println("_______________________________________________");
    }

    // This Method display the details of all items in the inventory
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Item Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Quantity : " + temp.quantity);
            System.out.println("Price : " + temp.price);
            System.out.println("_______________________________________________");
            temp = temp.next;
        }
    }

    // This Method Sort the list on the basis of ItemID
    public void sortList() {
        if(head == null || head.next == null) {
            return;
        }
        for (int i = 0; i < size - 1 ; i++) {
            ItemNode temp = head;
            ItemNode next = temp.next;
            for (int j = 0 ; j < size-i-1; j++) {
                if(temp.price > next.price) {
                    // Storing the value of temp node into temporary variables
                    String name = temp.itemName;
                    String itemID = temp.itemID;
                    int quantity = temp.quantity;
                    int price = temp.price;

                    // Storing the value of next node into temp node
                    temp.itemName = next.itemName;
                    temp.itemID = next.itemID;
                    temp.quantity = next.quantity;
                    temp.price = next.price;

                    // Storing the value in temporary variables into next node
                    next.itemName = name;
                    next.itemID = itemID;
                    next.quantity = quantity;
                    next.price = price;

                }
                // If there is a tie between prices of the item then we sort them on the basis of item name
                else if(temp.price == next.price) {
                    if(temp.itemName.compareTo(next.itemName) > 0) {
                        // Storing the value of temp node into temporary variables
                        String name = temp.itemName;
                        String itemID = temp.itemID;
                        int quantity = temp.quantity;
                        int price = temp.price;

                        // Storing the value of next node into temp node
                        temp.itemName = next.itemName;
                        temp.itemID = next.itemID;
                        temp.quantity = next.quantity;
                        temp.price = next.price;

                        // Storing the value in temporary variables into next node
                        next.itemName = name;
                        next.itemID = itemID;
                        next.quantity = quantity;
                        next.price = price;
                    }
                }
                temp = next;
                next = next.next;
            }
        }
    }
}