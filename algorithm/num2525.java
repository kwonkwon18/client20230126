package asdf;
import java.util.*;
public class num2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int d = a + ((b+c)/60);
		int e = ((b+c)%60);
		
		if((b+c) >= 60 && d >= 24) {
			System.out.println((d % 24) + " " + e);
			} 
		else if((b+c) >= 60 && d < 24) {
			System.out.println(d + " " + e);
		}else {
			System.out.println(a + " " + (b+c));
		}
		sc.close();
	}
	}
	

