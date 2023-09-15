package Week9;

import java.util.*;
import java.io.*;

public class 백준_9095_123더하기 {

	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			
			cnt=0;
			int n = Integer.parseInt(br.readLine());
			
			int start = 0;
			
			dfs1(start, n);
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
	public static void dfs1(int start, int n) {
		
		if(start == n) {
			cnt++;
			return;
		}
		if(start > n) return;
		dfs1(start+1, n);
		dfs2(start+2, n);
		dfs3(start+3, n);
	}
    public static void dfs2(int start, int n) {
		
		if(start == n) {
			cnt++;
			return;
		}
		if(start > n) return;
		dfs1(start+1, n);
		dfs2(start+2, n);
		dfs3(start+3, n);
	}
    public static void dfs3(int start, int n) {
	
	    if(start == n) {
	    	cnt++;
	    	return;
	    }
	    if(start > n) return;
	    dfs1(start+1, n);
	    dfs2(start+2, n);
	    dfs3(start+3, n);
}
}
