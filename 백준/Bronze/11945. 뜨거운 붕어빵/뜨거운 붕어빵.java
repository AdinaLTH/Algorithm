import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] s = new String[n];


        for (int i=0; i<n; i++) {
            s[i] = br.readLine();
            StringBuilder sb = new StringBuilder(s[i]);
            s[i] = sb.reverse().toString();
        }
        for (int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
    }
}