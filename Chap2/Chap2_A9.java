package Main0320;

import java.util.Scanner;

public class Chap2_A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int j = 0; //i가 소수인지 아닌지 확인해주는 변수
		
		for (int i = 2; i <= n; i++) {
			
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					j = 1;
					break;
				} 
			} 
			if (j == 0) {
				System.out.println(i); 
		}
			j=0;
		}
	}

}
