package algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class num1001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // 라인을 불러줌

		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken()); // 문자열을 인트형으로 전환
		int b = Integer.parseInt(st.nextToken()); // 문자열을 인트형으로 전환
		
		System.out.println(a-b);
	}
	

}
