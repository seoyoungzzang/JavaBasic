package Main;

public class chap5_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][5];
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = count;
				count++;
				System.out.println(numbers[i][j]);
			}
		}
	}
}
