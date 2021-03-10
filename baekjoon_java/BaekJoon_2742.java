package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_2742 {
	// https://www.acmicpc.net/problem/2742

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			for (int i = num; i > 0; --i) {
				bw.write(i+"\n");
			}
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {

		}
	}

}
