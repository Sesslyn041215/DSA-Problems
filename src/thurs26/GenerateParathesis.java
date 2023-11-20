package thurs26;

import java.util.*;

//You have given a string s that contains parentheses and letters, remove the minimum number
//of invalid parentheses to make the input string valid.
//Return all the possible results in sorted order and in new line.
//Input Format:
//Only line will contain one string s.
//Output Format:
//All Possible results in sorted manner.
//Sample Input 1:
//()()()
//Sample Output 1:
//(())()
//()()()
//Constraints:
//1 <= s.length <= 25
//s consists of lowercase English letters and parentheses '(' and ')'.
//There will be at most 20 parentheses in s.

public class GenerateParathesis {
	public static List<String> removeInvalidParentheses(String s) {
		if (s == null)
			return Arrays.asList("");
		List<String> rList = new ArrayList<>();
		List<String> sCand = new LinkedList<>();

		sCand.add(s);

		Set<String> visited = new HashSet<>();

		while (!sCand.isEmpty()) {
			for (String sC : sCand) {
				if (isValid(sC)) {
					rList.add(sC);
				}
			}

			if (rList.size() > 0)
				return rList;
			List<String> nextItr = new LinkedList<>();
			for (String cd : sCand) {
				for (int i = 0; i < cd.length(); i++) {
					char c = cd.charAt(i);
					if (c != '(' && c != ')')
						continue;
					StringBuffer sb = new StringBuffer(cd);
					String next = sb.deleteCharAt(i).toString();
					if (visited.contains(next))
						continue;
					visited.add(next);
					nextItr.add(next);
				}
				sCand = nextItr;
			}
		}

		return rList;
	}

	private static boolean isValid(String sVal) {
		int count = 0;

		for (char c : sVal.toCharArray()) {
			if (c == '(')
				count++;
			if (c == ')' && count-- == 0)
				return false;
		} 

		return count == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> L = removeInvalidParentheses(s);
		Collections.sort(L);
		for (String str : L) {
			System.out.println(str);
		}
	}
	
	//Using Stack
//	public static List<String> removeInvalidParentheses(String s) {
//        List<String> result = new ArrayList<>();
//        Set<String> visited = new HashSet<>();
//        Stack<String> stack = new Stack<>();
//
//        if (s == null) {
//            return result;
//        }
//
//        stack.push(s);
//        visited.add(s);
//        boolean found = false;
//
//        while (!stack.isEmpty()) {
//            String current = stack.pop();
//
//            if (isValid(current)) {
//                result.add(current);
//                found = true;
//            }
//
//            if (found) {
//                continue; // No need to remove more parentheses if we have already found valid combinations.
//            }
//
//            for (int i = 0; i < current.length(); i++) {
//                if (current.charAt(i) != '(' && current.charAt(i) != ')') {
//                    continue;
//                }
//
//                String next = current.substring(0, i) + current.substring(i + 1);
//
//                if (!visited.contains(next)) {
//                    stack.push(next);
//                    visited.add(next);
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static boolean isValid(String s) {
//        int count = 0;
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                count++;
//            } else if (c == ')') {
//                count--;
//                if (count < 0) {
//                    return false;
//                }
//            }
//        }
//        return count == 0;
//    }

}