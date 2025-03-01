import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i=1; i<=arr.length; i++) {
            arr[i-1] = i;
        }
        int cnt = 0;

        while (cnt < m) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int temp = 0;

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;

            cnt++;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
