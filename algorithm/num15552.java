package algorithm;
import java.util.StringTokenizer;
import java.io.*;
public class num15552 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st ;
		
		String str = br.readLine();

		for(int i = 1 ; i <= t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a+b);
		}
		

		

	}

}


// 갯수는 밖으로
// 입력수는 안으로 


