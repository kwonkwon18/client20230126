package algorithm;

public class gugu3_2 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 9; i > 6; i--) {

			for (int j = 2; j <= 9; j++) {

				System.out.print(i + " * " + j + " = " + i * j + " ");

				System.out.print((i - n) + " * " + j + " = " + (i - n) * j + " ");

				System.out.println((i - 6) + " * " + j + " = " + (i - 6) * j + " "); //  얘가 다음줄로 보내줌

			}

			System.out.println();

			n -= 2;

		}
	}
}