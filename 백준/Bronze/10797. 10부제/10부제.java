import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<5; i++) {
            int car = sc.nextInt();
            if (n == car) cnt++;
        }

        System.out.println(cnt);
    }
}