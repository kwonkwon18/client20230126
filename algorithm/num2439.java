package algorithm;

import java.util.*;

public class num2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;

		a = sc.nextInt();

		for(int i = 1; i <= a ; i++) {
			for(int j = 1 ; j <= a - i ; j++) {
				System.out.print(" ");} // 먼저 얠 채워줌
			for(int k = 1 ; k <= i ; k++) {
				System.out.print("*"); // 남은 부분에 얘를 넣는데, 일반 별 넣기 방식으로 넣음
				// 둘의 관계는 종속이 아니다. 
			}System.out.println();
		}
	}
}
