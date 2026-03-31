public class UglyNumber {
    // An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
    // Given an integer n, return true if n is an ugly number.
    public static boolean isUgly(int n) {
        if(n<=0) return false;
        else if(n == 1 || n==2) return true;
        while(n!=1 && n%2 == 0){
            n /= 2;
        }
        while(n!=1 && n%3 == 0){
            n /= 3;
        }
        while(n!=1 && n%5 == 0){
            n /= 5;
        }
        if(n == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("6 is Ugly Number : "+isUgly(6));
        System.out.println("1 is Ugly Number : "+isUgly(1));
        System.out.println("14 is Ugly Number : "+isUgly(14));
    }
}
