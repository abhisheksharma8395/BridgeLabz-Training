public class DoubleDatatype {
    public static void main(String[] args) {
        double number1 = 5; //it represents 5 as 5.0
        double number2 = 2; //it represents 2 as 2.0
        double number3 = number1 / number2; //it 5.0/2.0=2.5
        System.out.println("if we divide " + number1 + " with " + number2 + " then we get :" + number3);
        int number4 = 7; //it represents as 7
        double number5 = 2;  //it represents 2.0
        double number6 = number4 / number5;  //it represents 7/2.0=3.5
        System.out.println("if we divide " + number4 + " with " + number5 + " then we get :" + number6);
        int number7 = 8; //it represents as 8
        int number8 = 3;  //it represents 3
        double number9 = (double) number7 / number8;  //it represents 8.0/3 = 2.0
        System.out.println("if we divide " + number7 + " with " + number8 + " then we get :" + number9);
    }
}
