package LAB_4;

public class spacedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println();
		}
	}
}