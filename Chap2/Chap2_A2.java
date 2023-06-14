package Main0320;

public class Chap2_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		i = 1;
		j = 1;
		while (i >= 1 && i < 10) { // 구구단 단
			while (j < 10) {
				switch (j) {
				case 1:
					System.out.println(i + "X" + j + "=" + (i * j));
				case 2:
					System.out.println(i + "X" + (j + 1) + "=" + (i * (j + 1)));
				case 3:
					System.out.println(i + "X" + (j + 2) + "=" + (i * (j + 2)));
				case 4:
					System.out.println(i + "X" + (j + 3) + "=" + (i * (j + 3)));
				case 5:
					System.out.println(i + "X" + (j + 4) + "=" + (i * (j + 4)));
				case 6:
					System.out.println(i + "X" + (j + 5) + "=" + (i * (j + 5)));
				case 7:
					System.out.println(i + "X" + (j + 6) + "=" + (i * (j + 6)));
				case 8:
					System.out.println(i + "X" + (j + 7) + "=" + (i * (j + 7)));
				case 9:
					System.out.println(i + "X" + (j + 8) + "=" + (i * (j + 8)));
					break;
				}
				System.out.println("");
				i++;
				break;
			}
		}
	}

}
