import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max, min, mid = 0;

        max = Math.max(a, b);
        max = Math.max(max, c);
        min = Math.min(a, b);
        min = Math.min(min, c);

        if (a>min && a<max) {
            mid = a;
        } else if (b>min && b<max) {
            mid = b;
        } else if (c>min && c<max) {
            mid = c;
        }

        int dif = Math.min(mid - min, max - mid);
        if (mid-min != max-mid) {
            if (mid - min == dif) {
                System.out.println(mid + dif);
            } else if (max - mid == dif) {
                System.out.println(mid - dif);
            }
        } else {
            System.out.println(max+dif);
        }
    }
}
