import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken()); // 배열의 갯수
        int m = Integer.parseInt(stk.nextToken()); // 질의갯수

        int A[][] = new int[n+1][n+1]; // 입력 배열
        for(int i=1; i<=n; i++) {
            stk = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
                A[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int D[][] = new int[n+1][n+1]; //구간합
        for(int i=1; i<=n; i++) {
            for(int j = 1; j <= n; j++){
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        for(int i = 0; i < m; i++){
            stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken());
            int y1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            int y2 = Integer.parseInt(stk.nextToken());

            int result = D[x2][y2] - D[x1 -1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
