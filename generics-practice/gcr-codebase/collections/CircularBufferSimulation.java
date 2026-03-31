public class CircularBufferSimulation {
    public static void main(String[] args) {
        // Creating the object of CircularBuffer class with size 3
        CircularBuffer circularBuffer = new CircularBuffer(3);
        // Adding element in circularBuffer by using insert method of CircularBuffer
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        // Displaying the top element of circularBuffer
        System.out.println(circularBuffer.peek());
        // Adding element in circularBuffer by using insert method of CircularBuffer
        circularBuffer.insert(4);
        circularBuffer.insert(5);
        // Displaying element in circularBuffer by using display method
        circularBuffer.display();

    }
}

class CircularBuffer{
    int[] array;
    int size = 0;

    // Constructor of CircularBuffer class
    CircularBuffer(int size){
        array = new int[size];
    }

    // this method is used to add the element in CircularBuffer
    public void insert(int value){
        if(this.size == array.length){
            for(int i = 0; i < array.length-1; i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = value;
        }
        else{
            array[size] = value;
            size++;
        }
    }

    // this method is used to remove the element in CircularBuffer
    public int remove(){
        if(this.size == 0){
            System.err.println("CircularBuffer is empty");
            return -1;
        }
        else{
            int top = this.array[0];
            for(int i = 0; i < this.size-1; i++){
                this.array[i] = this.array[i+1];
            }
            this.array[this.size-1] = 0;
            this.size--;
            return top;
        }
    }

    // this method is used to see the top element in CircularBuffer
    public int peek(){
        if(this.size == 0){
            System.err.println("CircularBuffer is empty");
            return -1;
        }
        else{
            return this.array[0];
        }
    }

    // This Method is used to display the element in array
    public void display(){
        for(int i = 0; i < this.size; i++){
            System.out.print(this.array[i]);
            if(i != this.size - 1) System.out.print(", ");
        }
    }

}
