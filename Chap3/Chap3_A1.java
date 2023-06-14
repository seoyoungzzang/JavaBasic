package Main;

import java.util.Scanner;

public class Chap3_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while (true) {
			int n = scanner.nextInt();
			
			sum = sum + n;
			max = Math.max(max, n);
			min = Math.min(min, n);
			count++;
			
			if (count > 0) {
				double mean = (double) sum / count;
				System.out.println("Result : " + count + " - Mean " + mean + " Max " + max +  " Min " + min);	
			} else {
				System.out.println("Error");
			}
					 
					 
					 
		}
		
		
	}

}
