import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String string1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        String string2 = sc.nextLine();
        boolean palindromeOrNot = isPalindrome(string1, string2);
        if(palindromeOrNot){
            System.out.println("The String "+string1+" and "+string2+ " are palindrome.");
        }
        else{
            System.out.println("The String "+string1+" and "+string2+ " are not palindrome.");
        }
    }

    // This method checks whether two string are palindrome or not
    public static boolean isPalindrome(String str1,String str2) {
        if(str1.length() != str2.length()) return false;
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(str2.length()-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
