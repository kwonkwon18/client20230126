package algorithm;

import java.util.*;

public class num1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		int count = 0;
		int copy = a;
		
		while(true) {
			int left = (a % 10) * 10;
			int right = ((a%10) + (a/10)) % 10;
			a = left + (left + right) % 10 ;
			count++;
			if(a == copy ) {

				break;
			}
		}				System.out.println(count);
		
		


	}
}

