package algorithm;
import java.util.*;
import java.io.*;
public class num11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int t = Integer.parseInt(br.readLine()); // lines 는 그냥 읽기만 한다. 인트로 바꿔줘야함
		
		StringTokenizer st;
		
		for(int i = 1; i <= t ; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			
			System.out.println("Case #" + i + ": " 
			+ Integer.parseInt(st.nextToken()) 
			+ Integer.parseInt(st.nextToken()) 
			+ "\n"); // 섞어서 쓸 수 있음

			
			
		
		}
		br.close();


	}

}

