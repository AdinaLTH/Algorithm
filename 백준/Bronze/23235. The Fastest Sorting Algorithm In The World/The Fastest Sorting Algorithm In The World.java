import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            if (n==0) break;
            for (int i=0; i<n; i++) {
                int ex = Integer.parseInt(st.nextToken());
            }
            cnt++;
            System.out.printf("Case %d: Sorting... done!", cnt);
            System.out.println();
        }
    }
}
