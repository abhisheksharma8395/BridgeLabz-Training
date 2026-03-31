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


public class FindingMiddleOfLinkedList {

    // This method is used to return the node which is the middle node of the Linked list
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
        Node node9 = new Node(13);

        // Connecting Nodes with each other
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        // Now checking if the linked-list has cycle or not
        Node middleElement = middleNode(head);
        if(middleElement!=null){
            System.out.println("Middle Element : "+middleElement.val);
        }else{
            System.out.println("List is Empty");
        }


    }
}