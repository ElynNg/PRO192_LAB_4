package LAB_4;

public class waveNumbers40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_1();
		System.out.println();
		print_2();
		System.out.println();
		print_3();
		print_3();
		System.out.println();
		print_1();
	}

	public static void print_1() {
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
	}
	
	public static void print_2() {
		for (int i = 0; i < 10; i++) {
			System.out.print("_-^-");
		}
	}
	
	public static void print_3() {
		for (int i = 1; i <=9; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(i);
			}
		}
		System.out.print("00");
	}
	
}
