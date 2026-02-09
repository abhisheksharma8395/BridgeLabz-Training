package exceptions;

public class NestedTryCatchBlock{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        int index = 4;
        int divisor = 2;
        arrayDivision(arr,index,divisor);
    }

    // This method is used to Handle ArrayIndexOutOfBoundsException and NullPointerException
    public static void arrayDivision (int[] arr, int idx,int divisor){
        try{
            System.out.printf("Result when value at array index %d is %d when Divided by %d is : %d",idx,arr[idx],divisor,arr[idx]/divisor);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
    }
}
