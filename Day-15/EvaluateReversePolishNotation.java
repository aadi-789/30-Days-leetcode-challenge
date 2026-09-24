
import java.util.Stack;
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else {
                    result = a / b;
                }

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Input: [\"2\", \"1\", \"+\", \"3\", \"*\"] -> Output: " + evaluator.evalRPN(tokens1));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Input: [\"4\", \"13\", \"5\", \"/\", \"+\"] -> Output: " + evaluator.evalRPN(tokens2));

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println("Input: [\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"] -> Output: " + evaluator.evalRPN(tokens3));
    }
}
