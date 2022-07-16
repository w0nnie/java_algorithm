import java.util.Scanner;

public class BOJ11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i = 0; i < cNum.length; ++i) {
            sum += Integer.parseInt(String.valueOf(cNum[i]));
        }

        System.out.println(sum);
    }
}
