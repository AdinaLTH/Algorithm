import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            if (arr[i] > temp) {
                temp = arr[i];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
