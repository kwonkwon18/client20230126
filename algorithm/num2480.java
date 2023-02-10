package algorithm;
import java.util.*;

public class num2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println(10000 + (a*1000));
		}else if(a == b) {
			System.out.println(1000 + (a*100));
		}else if(a == c) {
			System.out.println(1000 + (a*100));
		}else if(c == b) {
			System.out.println(1000 + (b*100));
		}else if(a != b && b != c) {
			int max = a;
			if(b> max) max = b;
			if(c> max) max = c;

			 System.out.println(max* 100); // 맥스는 3항은 못구한다. 위의 if문을 통해서 찾아줄 것.
		}
		sc.close();
	}

	
}



