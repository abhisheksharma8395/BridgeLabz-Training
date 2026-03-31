// This program calculates the Simple Interest
public class CalculatingSimpleInterest {
    public static void main(String[] args) {
        double principal, rate, time, si;
        principal = 1000;
        rate = 5;
        time = 2;
        si = (principal * rate * time) / 100;  // Simple Interest = (Principle*Rate*Time)/100
        System.out.println(si);
    }
}
