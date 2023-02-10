package algorithm;

public class gugu2 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 1 ; j <= 9 ; j++)
				System.out.println((i+1) + "*" + j + " = " + (i+1)*j + "     " + (i+4) + "*" + j + " = " + (i+4)*j + "     " + (i+7) + "*" + j + " = " + (i+7)*j + "     ");
			System.out.println();
		}
	}
}
