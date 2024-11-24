import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            int n = sc.nextInt();
            a += Math.pow(n, 2);
        }
        System.out.println(a%10);
    }
}