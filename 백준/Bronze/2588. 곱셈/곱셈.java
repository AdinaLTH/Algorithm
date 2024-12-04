import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a = n1 * (n2 % 10);
        int b = n1 * (n2%100/10*10);
        int c = n1 * (n2/100*100);
        int res = a+b+c;

        System.out.println(a);
        System.out.println(b/10);
        System.out.println(c/100);
        System.out.println(res);
    }
}