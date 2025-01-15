import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i=0; i<n; i++) {
            s[i] = br.readLine();
        }

        int cnt = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<s[i].length(); j++) {
                char c = s[i].charAt(j);
                if (c == 'O') cnt++;
                else if (c == 'X') cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
            sum = 0;
            cnt = 0;
        }
    }
}
