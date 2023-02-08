package asdf;

import java.util.Scanner;

public class num2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a는 시간 b는 분
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b < 45) {
			if(a == 0) {
				System.out.println("23 " + (b+15) );
			} else if(a != 0){
				System.out.println( (a-1) +" "+ (b+15) );
			} 
		}
		else if(b >= 45) {
			System.out.println( a +" "+ (b-45) );
		}
		sc.close();
	} 
	

}

