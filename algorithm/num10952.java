package algorithm;
import java.util.*;
public class num10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;

		for(int i = 0; i >= 0 ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
			if( a == 0 && b == 0) {
				break;
			}
		}
	}

}
