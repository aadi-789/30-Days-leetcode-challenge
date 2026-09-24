import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();

        String input1 = "()";
        System.out.println("Input: " + input1 + " -> Output: " + validator.isValid(input1));

        String input2 = "()[]{}";
        System.out.println("Input: " + input2 + " -> Output: " + validator.isValid(input2));

        String input3 = "(]";
        System.out.println("Input: " + input3 + " -> Output: " + validator.isValid(input3));

        String input4 = "([)]";
        System.out.println("Input: " + input4 + " -> Output: " + validator.isValid(input4));

        String input5 = "{[]}";
        System.out.println("Input: " + input5 + " -> Output: " + validator.isValid(input5));
    }
}
