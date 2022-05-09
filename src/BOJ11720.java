import java.util.Arrays;
import java.util.Scanner;

public class BOJ11720 {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        //입력값을 String 변수 sNum()에 저정한 후 char[]형 변수로 변환하기

        String sNum = scanner.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i < cNum.length; i++){
            sum += Character.getNumericValue(cNum[i]); //책과 다르게 나는 char[]형태를 int로 형변환하여 sum에 더했다.
        }
        System.out.print(sum);
    }
}