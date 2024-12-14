import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[N*M];
        int[] arr2 = new int[N*M];

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i=0; i<arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[N*M];
        for (int i=0; i<N*M; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        for (int i=0; i<N*M; i++) {
            if (i!=0 && i%M==0) {
                System.out.println();
            }
            System.out.print(sum[i] + " ");
        }
    }
}