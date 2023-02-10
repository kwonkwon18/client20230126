package algorithm;
import java.util.*;
import java.io.*;
public class num11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1 ; i <= t ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken()); // 칸별로 읽을거야 해줘야함. 
			int b = Integer.parseInt(st.nextToken());
		
			System.out.println("Case #" + i + ": " + a + " + " + b 
					+ " = " + (a+b));
		
		}br.close();

	}

}
