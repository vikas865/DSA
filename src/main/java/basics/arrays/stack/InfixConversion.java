package basics.arrays.stack;

import java.util.Stack;

import org.apache.commons.lang3.Conversion;

public class InfixConversion {

	public static void conversionPrePost(String exp) {

		Stack<Character> operator = new Stack<Character>();
		Stack<String> pre = new Stack<>();
		Stack<String> post = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				operator.push(ch);
			} else if (Character.isLetter(ch)) {
				pre.push(ch + "");
				post.push(ch + "");

			} else if (ch == ')') {

				while (operator.peek() != '(') {

					char op = operator.pop();
					String val2 = pre.pop();
					String val1 = pre.pop();
					post.pop();
					post.pop();
					pre.push("" + op + val1 + val2);
					post.push(""+val1+ val2+op);
				}

				operator.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					
				while(!operator.isEmpty() && operator.peek() != '(' && precedence(ch)<= precedence(operator.peek())  ) {
					
					char op = operator.pop();
					String val2 = pre.pop();
					String val1 = pre.pop();
					post.pop();
					post.pop();
					pre.push("" + op + val1 + val2);
					post.push(""+val1+ val2+op);
					
				}
				operator.push(ch);
				
			}
		}
		
		while (!operator.isEmpty()) {

			char op = operator.pop();
			String val2 = pre.pop();
			String val1 = pre.pop();
			post.pop();
			post.pop();
			pre.push("" + op + val1 + val2);
			post.push(""+val1+ val2+op);
		}
		
			System.out.println(pre.peek());
			System.out.println(post.peek());
			System.out.println(pre);
			
	}

	

	public static int precedence(char ch) {
		if (ch == '+') {
			return 1;
		} else if (ch == '-') {
			return 1;
		} else if (ch == '*') {
			return 2;
		} else {
			return 2;
		}

	}

	public static void main(String[] args) {
		String exp = "a*(b-c)/d+e";
		conversionPrePost(exp);
	}

}
