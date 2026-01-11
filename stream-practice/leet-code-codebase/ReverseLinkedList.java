// ReverseLinkedList class
public class ReverseLinkedList{

    // This method is used to reverse the linked list
    public static Node reverseList(Node head) {
        Node previous=null;
        Node current=head;
        while(current!=null){
            Node agla=current.next;
            current.next=previous;
            previous=current;
            current=agla;
        }
        return previous;
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

        // Displaying linked list before reversing
        display(head);


        head = reverseList(head);
        // Displaying linked list after reversing
        display(head);

    }
}