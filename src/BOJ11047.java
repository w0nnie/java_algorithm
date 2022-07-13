import java.io.IOException;
import java.util.Scanner;

public class BOJ11047 {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //지폐의 갯수
        int k = sc.nextInt(); // 값
        int count = 0;
        int arr[] = new int[n];
        for (int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = n-1; i >= 0; i--){
            count += k/arr[i];
            k = k%arr[i];
            if(k == 0)
                break;
        }
        System.out.println(count);
    }
}