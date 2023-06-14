package Main;

import java.util.Scanner;

public class Chap3_P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String eq = scanner.nextLine();

		String[] eqs = eq.split("[+\\-*/]");
		float num1 = Float.parseFloat(eqs[0]);
		float num2 = Float.parseFloat(eqs[1]);
		String op = "";

		for (int i = 0; i < eq.length(); i++) {
			char c = eq.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				op = Character.toString(c);
				break;
			}
		}

		if (op.equals("+")) {
			System.out.println(eq);
			System.out.println((float)num1 + num2);
		} else if (op.equals("-")) {
			System.out.println(eq);
			System.out.println((float)num1 - num2);
		} else if (op.equals("*")) {
			System.out.println(eq);
			System.out.println((float)num1 * num2);
		} else if (op.equals("/")) {
			System.out.println(eq);
			System.out.println((float) num1 / num2);
		} else {
			System.out.println("올바른 식을 입력하세요.");
		}
	}

}
