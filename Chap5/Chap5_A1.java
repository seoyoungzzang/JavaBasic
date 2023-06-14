package Main;

import java.util.ArrayList;

public class Chap5_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] student = { { "Jeong", "70", "80", "100" }, { "Pyo", "60", "70", "86" },
				{ "Choi", "54", "100", "82" }, { "Mike", "87", "95", "79" } };
		String[] subjectName = { "Korean", "Math", "English" };
		String[] studentName = { "Jeong", "Pyo", "Choi", "Mike" };

		for (int i = 1; i < student[0].length; i++) {
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			for (int j = 0; j < student.length; j++) {
				int score = Integer.parseInt(student[j][i]);
				sum = sum + score;
				min = Math.min(min, score);
				max = Math.max(max, score);
			}

			double avg = (double) sum / student.length;

			ArrayList<Double> subject = new ArrayList<Double>();
			subject.add((double) sum);
			subject.add(Double.parseDouble(String.format("%.2f", avg)));
			subject.add((double) min);
			subject.add((double) max);
			System.out.println(subjectName[i - 1] + " : " + subject);
		}

		for (int i = 1; i < student[0].length; i++) {
			int sum = 0;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < student.length; j++) {
				int score = Integer.parseInt(student[j][i]);
				sum = sum + score;
				min = Math.min(min, score);
				max = Math.max(max, score);
			}
			double avg = (double) sum / (student[i].length - 1);

			ArrayList<Double> name = new ArrayList<Double>();
			name.add((double) sum);
			name.add(Double.parseDouble(String.format("%.2f", avg)));
			name.add((double) min);
			name.add((double) max);
			System.out.println(studentName[i - 1] + " : " + name);
		}
	}
}
