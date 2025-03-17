import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String maxSeminar = "";
        int max = 0;

        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String seminar = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());

            if (max < cnt) {
                max = cnt;
                maxSeminar = seminar;
            }
        }

        sb.append(maxSeminar);
        System.out.println(sb.toString());
    }
}
