import java.util.Stack;

public class QueuesUsingStacks{
    public static void main(String[] args) {

        // Creating the object of MyQueue class
        MyQueue queue = new MyQueue();

        // Performing operation to test the MyQueue class program
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
    }
}

// First in First out Data Structure
class MyQueue {
    // Taking help of two Stacks
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // This method is used for adding item in queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // This method is used to delete the item from queue
    public int dequeue() {
        if (stack1.isEmpty()) {                                                // If there is no element exists into queue
            System.err.println("Queue is already empty");
            return -1;
        }
        int value;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        value = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return value;
    }

    // This method is used to show the peek element
    public int peek() {
        if (stack1.isEmpty()) {                                                // If there is no element exists into queue
            System.err.println("Queue is already empty");
            return -1;
        }
        int value;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        value = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return value;
    }
}