package algorithm;
import java.util.*;
public class num2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) { // int 붙여줘야 초기화됨 .. 
			System.out.println(a + " * " + i + " = " + (i * a));

		}
		sc.close();
	}

}
