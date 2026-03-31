package singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtBeginning(5);
        System.out.println("Printing List");
        list.display();
        list.addAtBeginning(7);
        System.out.println("Printing List");
        list.display();
        list.addAtBeginning(8);
        System.out.println("Printing List");
        list.display();
        list.addAtLast(9);
        System.out.println("Printing List");
        list.display();
        list.addAtLast(10);
        System.out.println("Printing List");
        list.display();
        list.addAtSpecificIndex(6,3);
        System.out.println("Printing List");
        list.display();
        list.addAtSpecificIndex(4,4);
        System.out.println("Printing List");
        list.display();

        list.deleteFromBeginning();
        System.out.println("Printing List");
        list.display();
        list.deleteFromSpecificIndex(3);
        System.out.println("Printing List");
        list.display();
    }
}
