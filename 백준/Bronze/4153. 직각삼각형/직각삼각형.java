import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int t;
            if (a>b) {
                t=b;
                b=a;
                a=t;
            }

            if (b>c) {
                t=c;
                c=b;
                b=t;
            }

            if (a+b+c == 0) break;
            if (a*a + b*b == c*c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}