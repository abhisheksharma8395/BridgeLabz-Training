import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        // Creating the object of Queue class
        Queue<Integer> queue = new LinkedList<>();
        // Adding the elements in queue object
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Displaying the queue before reversing
        System.out.println(queue);

        // Reversing the queue
        reverseQueue(queue);

        // Displaying the queue after reversing
        System.out.println(queue);
    }

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < queue.size(); i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }


}


