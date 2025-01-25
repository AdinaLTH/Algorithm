import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String[] s = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 0;

        for (int i=0; i<x; i++) {
            n += m[i];
        }
        n += y-1;

        System.out.println(s[n%7]);
    }
}
