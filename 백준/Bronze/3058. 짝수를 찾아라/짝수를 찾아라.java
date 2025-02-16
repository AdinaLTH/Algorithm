import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            int min = 100;
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j=0; j<7; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n%2 == 0) {
                    sum += n;
                    min = Math.min(n, min);
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
