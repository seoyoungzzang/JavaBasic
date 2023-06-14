package Main;

import java.util.Scanner;

public class Chap4_A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int subjectNum = scanner.nextInt();

		String unit = "";
		String grade = "";
		String unitSum = "";
		double gradeSum = 0;
		int count = 0;

		for (int i = 0; i < subjectNum; i++) {
			unit = scanner.next();
			unitSum = unitSum + unit;
			count = count + Integer.parseInt(unit);
		}
		
		for (int i = 0; i < subjectNum; i++) {
			grade = scanner.next();
			
			switch (grade) {
			case "A+":
				gradeSum = gradeSum + (4.5 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "A0":
				gradeSum = gradeSum + (4.0 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "B+":
				gradeSum = gradeSum + (3.5 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "B0":
				gradeSum = gradeSum + (3.0 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "C+":
				gradeSum = gradeSum + (2.5 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "C0":
				gradeSum = gradeSum + (2.0 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "D+":
				gradeSum = gradeSum + (1.5 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "D0":
				gradeSum = gradeSum + (1.0 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			case "F":
				gradeSum = gradeSum + (0.0 * Integer.parseInt(unitSum.substring(i, i + 1)));
				break;
			default:
				System.out.println("다시!");
				break;
			}

		}
		double avg = gradeSum / count;
		System.out.println(avg);
	}

}
