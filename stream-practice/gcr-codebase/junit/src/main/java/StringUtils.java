public class StringUtils {
    // This method is used to reverse the string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    // This method is used to check whether the string is palindrome or not
    public boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }
    // This method is used to convert the string into uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
