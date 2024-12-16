import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A*B*C;
        char[] arr = Integer.toString(result).toCharArray();

        int[] cnt = new int[10];

        for(int i=0; i<arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            cnt[temp]++;
        }

        for (int i=0; i<10; i++) {
            System.out.println(cnt[i]);
        }
    }
}