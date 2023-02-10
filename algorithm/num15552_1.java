package algorithm;
import java.util.StringTokenizer;
import java.io.*;
public class num15552_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st ;  // st 객체 선언
		


		for(int i = 1 ; i <= t; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 반복문 안에 객체 할당 및 초기화
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+ "\n"); // 여기서 값을 받음

		}br.close();
		bw.flush();
		bw.close();
		

		

	}

}


// 갯수는 밖으로
// 입력수는 안으로 


