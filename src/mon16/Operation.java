package mon16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Evaluate expression Problem statement You are given a function, Int
//EvaluateExpression(String expr); The function accepts a mathematical expression
//‘expr’ as a parameter. Implement the function to evaluate the given expression.
//Assumption:
//•You can assume there is no space in between any of the characters of the
//expression ‘expr’
//•Expression ‘expr’ contains only digits and operators Note:
//•Every operation should be integer based e.g: 5/2 should be given 2, not 2.5
//•Consider the precedence of operators while evaluating the expressions,
//precedence of(‘/’ or ‘*’ ) > precedence of(‘+’ or ‘-’)
//•If ‘expr’ has multiple operators of the same precedence then evaluate them from
//left to right.
//Example: Input: Expr: 2+3+5*4/2 Output: 15 Explanation: 2+3+5*4/2=
//2+3+10=15, hence 15 is the evaluated value. The custom input format for the
//above case: 9 2+3+5*4/2 (The first line represents the length of the string, the
//second line represents the string) Sample Input Expr: 22+15-2*7/3 Sample Output
//33 The custom input format for the above case: 11 22+15-2*7/3 (The first line
//represents the length of the string, the second line represents the string)

public class Operation {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String expr = in.next();
	        String num = "1234567890";
	        String spl = "/*+-";
	        List<String> arr = new ArrayList<>();
	        int i = 0;

	        while (i < expr.length()) {
	            int value = 0;
	            while (i < expr.length() && num.contains(String.valueOf(expr.charAt(i)))) {
	                value = value * 10 + Integer.parseInt(String.valueOf(expr.charAt(i)));
	                i++;
	            }
	            arr.add(Integer.toString(value));
	            
	            if (i < expr.length() && spl.contains(String.valueOf(expr.charAt(i)))) {
	                arr.add(String.valueOf(expr.charAt(i)));
	                i++;
	            }
	        }

	        while (arr.contains("/")) {
	            int k = arr.indexOf("/");
	            int FV = Integer.parseInt(arr.get(k - 1)) / Integer.parseInt(arr.get(k + 1));
	            arr.set(k - 1, Integer.toString(FV));
	            arr.remove(k);
	            arr.remove(k);
	        }
	        while (arr.contains("*")) {
	            int l = arr.indexOf("*");
	            int FV = Integer.parseInt(arr.get(l - 1)) * Integer.parseInt(arr.get(l + 1));
	            arr.set(l - 1, Integer.toString(FV));
	            arr.remove(l);
	            arr.remove(l);
	        }
	        while (arr.contains("+")) {
	            int m = arr.indexOf("+");
	            int FV = Integer.parseInt(arr.get(m - 1)) + Integer.parseInt(arr.get(m + 1));
	            arr.set(m - 1, Integer.toString(FV));
	            arr.remove(m);
	            arr.remove(m);
	        }
	        while (arr.contains("-")) {
	            int n = arr.indexOf("-");
	            int FV = Integer.parseInt(arr.get(n - 1)) - Integer.parseInt(arr.get(n + 1));
	            arr.set(n - 1, Integer.toString(FV));
	            arr.remove(n);
	        }

	        System.out.println(arr.get(0));
	    }
}
