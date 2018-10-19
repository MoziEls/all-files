
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(numbers[2]);

		String[] colours = new String[5];
		colours[0] = "red";
		colours[1] = "blue";
		colours[2] = "brown";
		colours[3] = "black";
		colours[4] = "orange";
		int i = 0;
		do {
			System.out.println(colours[i]);
			i = i + 1;
		} while (i < 3);
	}

}
