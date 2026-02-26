import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class StringValidatorUsingStream {
    public static void main(String[] args) {
        String s1="[{()}]";
        String s2="[{(}]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String str){
        Stack <Character> stack = new Stack<>();
        AtomicBoolean flag = new AtomicBoolean(true);

        str.chars().mapToObj(x-> (char) x).forEach(x -> {
            if(stack.isEmpty() && ((x == '(') || (x == '{') || (x == '['))) stack.push(x);
            else if ((x == '(') || (x == '{') || (x == '[')) stack.push(x);
            else if((x == ')') && (stack.peek() == '(')) stack.pop();
            else if((x == '}') && (stack.peek() == '{')) stack.pop();
            else if((x == ']') && (stack.peek() == '[')) stack.pop();
            else flag.set(false);
        });

        return flag.get() && stack.isEmpty();
    }
}
