
import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "JAVA";
        String output = reverse(input);
        
        System.out.println("Original: " + input); // Output: JAVA
        System.out.println("Reversed: " + output); // Output: AVAJ
    }
}
