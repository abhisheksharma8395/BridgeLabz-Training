

class CustomHashMap {
    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    // Hash function
    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    // Put key-value pair into map
    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        Node current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value; // Overwrite existing
                return;
            }
            current = current.next;
        }

        // Insert at head
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Get value by key
    public int get(int key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }

        return -1; // Not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next; // remove head
                } else {
                    prev.next = current.next; // remove middle/end
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
public class CustomHashMapImplementation {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(1001, 30); // Will go to the same bucket as 1 (collision)

        System.out.println(map.get(1));    // 10
        System.out.println(map.get(2));    // 20
        System.out.println(map.get(1001)); // 30
        System.out.println(map.get(3));    // -1 (not found)

        map.remove(1);
        System.out.println(map.get(1));    // -1 (removed)
    }
}

