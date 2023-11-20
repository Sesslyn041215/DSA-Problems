package tues03;

//Ravi wants to do some arithmetic operations for his grocery store. He was planning to do
//addition, subtraction, multiplication, and division in a fast way so that he can reduce the
//time for calculation. Ravi wants to get two inputs as integer and to do the operation.
//If anyone of the input is zero it should print as "Bad Operation", if he enters any numbers or
//character instead of operators it should display that "It is not a Valid Operator" and if the
//entered values are the correct form it has to display the answer. Help Ravi to handle this
//situation by writing code.

public class ArithemticOperations {
	public static void main(String[] args) {
		int firstValue = 2;
		int secondValue = 5;
		String operator = "+";

		if (firstValue == 0 || secondValue == 0) {
			System.out.println("Bad Input");
		} else if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator)) {
			int output = 0;

			if ("+".equals(operator)) {
				output = firstValue + secondValue;
			} else if ("-".equals(operator)) {
				output = firstValue - secondValue;
			} else if ("*".equals(operator)) {
				output = firstValue * secondValue;
			} else if ("/".equals(operator)) {
				output = firstValue / secondValue;
			}
			System.out.println("Result: " + output);
		} else {
			System.out.println("It is not a Valid Operator");
		}
	}

}

//public class Calculator {
//	public static void main(String[] args) {
//		try {
//			Scanner scanner = new Scanner(System.in);
//			int n1 = scanner.nextInt();
//			if (n1 == 0) {
//				throw new Exception("Bad Operation");
//			}
//			String operator = scanner.next();
//			if (!operator.matches("[+\\-*/]")) {
//				throw new Exception("It is not a Valid Operator");
//			}
//			int n2 = scanner.nextInt();
//			if (n2 == 0) {
//				throw new Exception("Bad Operation");
//			}
//			double ans = 0;
//			switch (operator) {
//			case "+":
//				ans = n1 + n2;
//				break;
//			case "-":
//				ans = n1 - n2;
//				break;
//			case "*":
//				ans = n1 * n2;
//				break;
//			case "/":
//				ans = (double) n1 / n2;
//				break;
//			}
//			System.out.println(n1 + " " + operator + " " + n2 + " = " + ans);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}