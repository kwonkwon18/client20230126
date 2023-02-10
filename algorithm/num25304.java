package algorithm;
import java.util.*;
public class num25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(); // 아.. 한번에 다 넣고 돌릴수가 없고 하나하나 해줘야하니까 여기 안으로 들어와야함.. 후.. 
			int b = sc.nextInt();
			sum += a * b;
			
		}
		if(sum == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
