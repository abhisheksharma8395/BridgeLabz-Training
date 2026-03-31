package singly_linked_list;

public class LinkedList {
    LinkedListNode head = null;
    LinkedListNode tail = null;
    int size = 0;

    public void addAtBeginning(int data){
        LinkedListNode newNode = new LinkedListNode(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        this.size++;
    }

    public void addAtLast(int data){
        LinkedListNode newNode = new LinkedListNode(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        this.size++;
    }

    public void addAtSpecificIndex(int data,int index){
        LinkedListNode newNode = new LinkedListNode(data);
        if(index < 0 || index > this.size){
            System.err.println("Index out of bound");
            return;
        }
        else if(index == size){
            addAtLast(newNode.data);
            return;
        }
        else if (index == 0) {
            addAtBeginning(newNode.data);
            return;
        }
        LinkedListNode prev = null;
        LinkedListNode current = head;
        for(int i = 0;i<index ; i++){
            prev = current;
            current = current.next;
        }
        newNode.next = current;
        prev.next = newNode;
        this.size++;
    }

    public void deleteFromBeginning(){
        if(head == null){
            System.err.println("Underflow");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        head = head.next;
        this.size--;
    }

    public void deleteFromSpecificIndex(int index){
        if(head == null || index < 0 || index >= this.size){
            System.err.println("Underflow can't delete");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        LinkedListNode prev = null;
        LinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        this.size--;
    }

    public void display(){
        LinkedListNode temp = head;
        if(head == null){
            System.out.println("List is null currently");
            return;
        }
        for(int i = 0;i<size;i++){
            if(i!=size-1) System.out.print(temp.data+" -> ");
            else System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println(" ");
    }

}
