package basics.arrays.stack;

import java.util.Stack;

public class InfixEvaluation {

	public static void infixOperation(String exp) {

		Stack<Character> operation = new Stack<>();
		Stack<Integer> operands = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {

				operation.push(ch);

			} else if (Character.isDigit(ch)) {
				operands.push(ch - '0');
			} else if (ch == ')') {
				// pop all unit ( and perom all operation in between
				while (operation.peek() != '(') {
					char op = operation.pop();
					int v2 = operands.pop();
					int v1 = operands.pop();

					int opv = operation(v1, v2, op);
					operands.push(opv);

				}

				operation.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				// pop all unitl leseer opertaion or not get ( or size is zero

				while (operation.size() > 0 && operation.peek() != '('
						&& precedence(ch) <= precedence(operation.peek())) {
					
					char op = operation.pop();
					int v2 = operands.pop();
					int v1 = operands.pop();

					int opv = operation(v1, v2, op);
					operands.push(opv);
					

				}
				operation.push(ch);

			}

		}
		
		while (operation.size() !=0) {
			char op = operation.pop();
			int v2 = operands.pop();
			int v1 = operands.pop();

			int opv = operation(v1, v2, op);
			operands.push(opv);

		}
		
		System.out.println(operands.peek());

	}

	

	public static int operation(int v1, int v2, char operands) {

		if (operands == '+') {
			return v1 + v2;
		} else if (operands == '-') {
			return v1 - v2;
		} else if (operands == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}

	}

	public static int precedence(char operands) {
		if (operands == '+') {
			return 1;
		} else if (operands == '-') {
			return 1;
		} else if (operands == '*') {
			return 2;
		} else {
			return 2;
		}

	}

	public static void main(String[] args) {
		String exp = "2+(5-3 *6/2)";
		infixOperation(exp);
	}

}
