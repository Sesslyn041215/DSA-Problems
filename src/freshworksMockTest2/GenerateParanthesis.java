package freshworksMockTest2;

import java.util.Stack;

//Given an array containing only brackets { }. Find if the array has matching brackets					
public class GenerateParanthesis {
	public static boolean hasMatchingBrackets(String[] brackets) {
        Stack<String> stack = new Stack<>();

        for (String bracket : brackets) {
            if (bracket.equals("{")) {
                stack.push("{");
            } else if (bracket.equals("}")) {
                if (stack.isEmpty() || !stack.pop().equals("{")) {
                    return false; // Mismatched brackets
                }
            } else {
                // Ignore any characters that are not brackets
            }
        }

        return stack.isEmpty(); // If the stack is empty, all brackets matched
    }

    public static void main(String[] args) {
        String[] bracketArray = {"{", "}", "{", "{", "}", "}", "}"};
        boolean isMatching = hasMatchingBrackets(bracketArray);
        
        if (isMatching) {
            System.out.println("The brackets are matching.");
        } else {
            System.out.println("The brackets are not matching.");
        }
    }
}
