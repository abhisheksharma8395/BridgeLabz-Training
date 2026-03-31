import java.util.ArrayList;

public class UglyNumber2 {
    // An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
    // Given an integer n, return the nth ugly number.
    public static int nthUglyNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while(list.size()<n){
            if(isUgly(i)){
                list.add(i);
            }
            i++;
        }
        return list.get(n-1);
    }
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
        System.out.println("10th ugly number : "+nthUglyNumber(10));
        System.out.println("1st ugly number : "+nthUglyNumber(1));
    }
}
