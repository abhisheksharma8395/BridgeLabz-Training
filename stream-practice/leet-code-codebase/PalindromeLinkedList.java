public class PalindromeLinkedList {

    // This Method reverse the String
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
        }
        return prev;
    }

    // This Method is Used to check linked list is palindrome or not
    public boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node start = head;
        Node other = slow.next;
        while (other != null) {
            if (start.val != other.val) return false;
            start = start.next;
            other = other.next;
        }
        return true;
    }

}
