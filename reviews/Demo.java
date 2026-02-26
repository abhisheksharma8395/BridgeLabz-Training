import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        String s1="[{()}]";
        String s2="[{(}]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(Character character : str.toCharArray()){
            if(stack.isEmpty() && (character == '(' || character == '[' || character == '{')){
                stack.push(character);
            }
            else if((character == '(' || character == '[' || character == '{')){
                stack.push(character);
            }
            else if(stack.peek() == '(' && character == ')'){
                stack.pop();
            }
            else if(stack.peek() == '[' && character == ']'){
                stack.pop();
            }
            else if(stack.peek() == '{' && character == '}'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
