package exceptions;

public class MultipleCatchBlocks{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        int index = 4;
        arrayOperations(arr,index);
    }

    // This method is used to Handle ArrayIndexOutOfBoundsException and NullPointerException
    public static void arrayOperations (int[] arr, int idx){
        try{
            System.out.println("Value at index "+idx+": "+arr[idx]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
