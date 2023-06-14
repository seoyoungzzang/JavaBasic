package Main;

import java.util.Scanner;

public class Chap3_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int pos = 0;
		int neg = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;
		
		while (true) {
			int n = scanner.nextInt();
			
			if (n > 0) {
				pos++;
			} else if (n == 0) {
				zero++;
			} else {
				neg++;
			}
			
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			
			System.out.println("P - " + pos + ", N - " + neg + ", Z - " + zero +", O - " + odd + ", E - " + even);
		}
	}

}
