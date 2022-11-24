package LAB_4;

public class fibonacci {
	public static void main(String[] args) {
		int add = 0;
		int result = 1;
		for (int i = 0; i < 12; i++) {
			System.out.print(result + " ");
			int temp = add + result;
			add = result;
			result = temp;
		}
	}
}
