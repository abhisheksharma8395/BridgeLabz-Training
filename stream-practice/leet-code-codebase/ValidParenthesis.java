import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                st.push(i);
            }
            else if(!st.isEmpty() && i==')' && st.peek()=='('){
                st.pop();
            }
            else if(!st.isEmpty() && i=='}' && st.peek()=='{'){
                st.pop();
            }
            else if(!st.isEmpty() && i==']' && st.peek()=='['){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}
