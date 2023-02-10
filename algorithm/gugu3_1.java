package algorithm;

public class gugu3_1 {

	public static void main(String[] args) {

		for (int i = 9; i > 6; i--) {

			for (int j = 2; j <= 9; j++) {

				System.out.print(i + " * " + j + " = " + i * j + " ");

				if (i == 9)

					System.out.print((i - 5) + " * " + j + " = " + (i - 5) * j + " ");

				else if (i == 8)

					System.out.print((i - 3) + " * " + j + " = " + (i - 3) * j + " ");

				else

					System.out.print((i - 1) + " * " + j + " = " + (i - 1) * j + " ");

				System.out.println((i - 6) + " * " + j + " = " + (i - 6) * j + " ");

			}

			System.out.println();

		}
	}
}
