public class DoubleDatatype {
    public static void main(String[] args) {
        double x = 5; //it represents 5 as 5.0
        double y = 2; //it represents 2 as 2.0
        double z = x / y; //it 5.0/2.0=2.5
        System.out.println("if we divide " + x + " with " + y + " then we get :" + z);
        int a = 7; //it represents as 7
        double b = 2;  //it represents 2.0
        double c = a / b;  //it represents 7/2.0=3.5
        System.out.println("if we divide " + a + " with " + b + " then we get :" + c);
        int e = 8; //it represents as 8
        int f = 3;  //it represents 3
        double g = (double) e / f;  //it represents 8.0/3 = 2.0
        System.out.println("if we divide " + e + " with " + f + " then we get :" + g);
    }
}
