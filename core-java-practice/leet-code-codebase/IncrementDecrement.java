public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        x--;               //x-- represents x=x-1,--x also represents x=x-1 but have different uses
        System.out.println(x);
        int y = 6;
        System.out.println(y++);  //it first prints value 6 after that increase the value to 7
        System.out.println(y);    //it prints 7
        int z = 8;
        System.out.println(++z); //it first increases the value to 9 and then print 9
        System.out.println(z);  //it also prints the value 9
        int v = 7;
        System.out.println(v--); //it prints 7 after that decrease the value
        System.out.println(v); //it prints the value 6
        int t = 9;
        System.out.println(--v); //firstly it decrease the value to 8 and then print it
    }
}
