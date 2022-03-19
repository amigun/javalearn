public class Main {
	public static void main(String[] args) {
		int []arr = new int[] {1, 2, 3, 4};
		int result = 1;

		for (int value : arr) {
			result *= value;
		}

		System.out.print("Result: " + result);
	}
}
