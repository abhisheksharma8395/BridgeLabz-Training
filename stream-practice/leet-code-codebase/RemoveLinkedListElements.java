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

// RemoveLinkedListElements class
public class RemoveLinkedListElements{

    // This method is used to remove the linked list elements
    public static Node removeElements(Node head, int val) {
        if(head==null) return null;
        Node Dummy=new Node(5);                        // Dummy Node
        Dummy.next=head;
        Node current=Dummy;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }

        }
        return Dummy.next;
    }

    // This method is used to display the linked list
    public static void display(Node head) {
        if(head==null) return ;
        Node temp =  head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println(" ");
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

        // Displaying linked list before removing any node
        display(head);

        // Now checking if the linked-list has cycle or not
        Node start = removeElements(head, 6);
        display(start);

    }
}