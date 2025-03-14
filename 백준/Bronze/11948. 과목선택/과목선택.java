import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = 0;
        sum += arr[1] + arr[2] + arr[3];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        sum += Math.max(a, b);

        System.out.println(sum);
    }
}
