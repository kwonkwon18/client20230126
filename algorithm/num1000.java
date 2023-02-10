package algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class num1000 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // 여기로 입력, 이건 한줄만 읽어줌.. 
		
		StringTokenizer st = new StringTokenizer(str, " "); // 문자열을 띄어쓰기 구분으로 해줌
		int a = Integer.parseInt(st.nextToken()); // 다음토큰 반환
		int b = Integer.parseInt(st.nextToken()); // 다음토큰 반환
		
		System.out.println(a+b);
	}

}
