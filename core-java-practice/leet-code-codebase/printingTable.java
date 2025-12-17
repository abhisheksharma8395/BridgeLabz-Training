import java.util.Scanner;
public class printingTable{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       // Taking input from users
       int num = sc.nextInt();
       int i = 1;
       while(i<=10){
           System.out.println(num+" x "+i+" = "+(num*i));
           i++;
       }
   }

}