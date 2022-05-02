import java.util.Scanner;

public class BOJ2739 {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
       for (int i=0; i<=9; i++){
           System.out.println(a + " * " + i + " = " + a*i);
       }
        scanner.close();
    }
}