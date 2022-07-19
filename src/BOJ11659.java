import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken()); // 배열의 갯수
        int m = Integer.parseInt(stk.nextToken()); // 질의갯수

        long s[] = new long[n+1];
        stk = new StringTokenizer(br.readLine());
        for ( int i = 1; i <= n; i ++){
            s[i] = s[i - 1] + Integer.parseInt(stk.nextToken()); //배열의 합
        }
        for (int q = 0; q < m; q++){
            stk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stk.nextToken());
            int j = Integer.parseInt(stk.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }
}
