package Main0320;

import java.util.Scanner;

public class Chap2_P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		if (text.contains("car") || text.contains("Car") || text.contains("cAr") || text.contains("caR")
				|| text.contains("CAr") || text.contains("cAR") || text.contains("CaR") || text.contains("CAR")) {
			System.out.println(text + " is included in the input string");
		} else {
			System.out.println(text + " is not included in the input string");
		}
	}

}
