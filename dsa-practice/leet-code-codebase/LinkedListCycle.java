// Class Node that is blueprint for the node of linked-list
class Node {
    int val;                                         // Stores the value
    Node next;                                       // Stores the reference of next node

    // Constructor of Node class to initialize variables
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}


public class LinkedListCycle {

    // This method is used to check if linked list has cycle or not by using two pointer technique
    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating object of Node class
        Node head = new Node(5);
        Node node2 = new Node(6);
        Node node3 = new Node(7);
        Node node4 = new Node(8);
        Node node5 = new Node(9);
        Node node6 = new Node(10);
        Node node7 = new Node(11);
        Node node8 = new Node(12);

        // Connecting Nodes with each other
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node5;

        // Now checking if the linked-list has cycle or not
        if(hasCycle(head)) System.out.println("List Contains cycle.");
        else System.out.println("List Does not Contains cycle.");

    }
}
