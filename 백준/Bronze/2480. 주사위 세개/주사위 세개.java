import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (a==b && a==c) {
            System.out.println(10000+a*1000);
        } else if (a==b || a==c) {
            System.out.println(1000+a*100);
        } else if (b==c) {
            System.out.println(1000+b*100);
        } else {
            if (max<a){
                max=a;
            }
            if (max<b){
                max=b;
            }
            if (max<c){
                max=c;
            }
            System.out.println(max*100);
        }
    }
}