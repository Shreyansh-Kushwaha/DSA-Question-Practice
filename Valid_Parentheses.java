import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {

        String s = "([{])}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

      
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
  
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char top = stack.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    stack.pop();
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }


        System.out.println(stack.isEmpty() ? "true" : "false");
    }
}
