import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = w-x;
        int b = x;
        int c = h-y;
        int d = y;
        int t1 = 0;
        int t2 = 0;
        if (a >= b) {
            t1 = b;
        } else if(b >= a) {
            t1 = a;
        }

        if (c >= d) {
            t2 = d;
        } else if(d >= c) {
            t2 = c;
        }

        if (t1 >= t2) {
            System.out.println(t2);
        } else if(t2 >= t1) {
            System.out.println(t1);
        }
    }
}
