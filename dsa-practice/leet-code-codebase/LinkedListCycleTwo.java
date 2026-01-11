public class LinkedListCycleTwo {

    // This method is used to check if linked list has cycle if it has then returning the Node from where the cycle starts
    public static Node detectCycle(Node head) {
        Node slow =  head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
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
        Node startCycle = detectCycle(head);
        if(startCycle!=null){
            System.out.println("Cycle found starts with the Node value "+startCycle.val);
        }
        else System.out.println("Cycle not found");

    }
}
