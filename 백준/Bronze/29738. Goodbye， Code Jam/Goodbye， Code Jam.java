import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i=1; i<=t; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 4500) {
                System.out.printf("Case #%d: Round 1\n", i);
            } else if (x > 1000) {
                System.out.printf("Case #%d: Round 2\n", i);
            } else if (x > 25) {
                System.out.printf("Case #%d: Round 3\n", i);
            } else {
                System.out.printf("Case #%d: World Finals\n", i);
            }
        }
    }
}
