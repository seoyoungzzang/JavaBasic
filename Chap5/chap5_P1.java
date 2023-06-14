package Main;

public class chap5_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		String[] name = { "kim", "lee", "park" };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		try {
			System.out.println(name[3]);
		} catch (Exception e) {
			System.out.println("Error");
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
