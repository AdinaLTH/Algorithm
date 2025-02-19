import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            String empty = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int sStrong = 0;
            int bStrong = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int s = Integer.parseInt(st.nextToken());
                if (sStrong < s) sStrong = s;
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int b = Integer.parseInt(st.nextToken());
                if (bStrong < b) bStrong = b;
            }

            if (sStrong > bStrong) System.out.println("S");
            else if (sStrong < bStrong) System.out.println("B");
            else System.out.println("S");
        }
    }
}