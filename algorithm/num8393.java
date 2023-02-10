package algorithm;
import java.util.*;
public class num8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= a ; i++) { // int 붙여줘야함
			sum += i;
		}
		
		System.out.println(sum); // 다 돌리고 나서 sum을 받는
	}

}
