import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String[] s = br.readLine().split(" ");

            int R = Integer.parseInt(s[0]);

            for (byte var : s[1].getBytes()) {
                for (int j=0; j<R; j++) {
                    sb.append((char) var);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}