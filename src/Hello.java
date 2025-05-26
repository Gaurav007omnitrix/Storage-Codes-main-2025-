import java.util.Stack;

public class Hello {

public static String isBalanced(String s)
        {
        Stack<Character> stack = new Stack<>();
        for (char bracket: s.toCharArray()) {
        if (isOpen(bracket)) {
        stack.add(bracket);
        } else {
        if (stack.isEmpty()) {
        return "NO";
        }
        if (isMatch(stack.peek(), bracket)) {
        stack.pop();
        } else {
        return "NO";
        }
        }
        }

        return stack.isEmpty() ? "YES" : "NO";
        }

static boolean isOpen(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
        }

static boolean isMatch(char open, char close) {
    String bracket = String.valueOf(open) + String.valueOf(close);
    return bracket.equals("()") || bracket.equals("{}") || bracket.equals("[]");
}
        }