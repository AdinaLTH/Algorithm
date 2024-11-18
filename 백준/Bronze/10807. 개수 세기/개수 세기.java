import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int cnt=0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}