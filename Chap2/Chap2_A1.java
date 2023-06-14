package Main0320;

public class Chap2_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 100; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
				if (j > 8)
					break;
			}
			System.out.println("");
		}
	}

}
