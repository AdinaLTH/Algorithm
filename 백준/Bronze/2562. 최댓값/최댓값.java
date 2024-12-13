import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        int t = 0;
        for (int i=1; i<=arr.length-1; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                t = i;
            }
        }
        System.out.println(max);
        System.out.println(t);
    }
}