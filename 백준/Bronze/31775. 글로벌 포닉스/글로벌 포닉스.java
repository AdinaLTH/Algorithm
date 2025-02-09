import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = br.readLine();
            if (s[i].charAt(0) == 'l' || s[i].charAt(0) == 'k' || s[i].charAt(0) == 'p') {
                cnt++;
            }
        }
        if (s[0].charAt(0) == s[1].charAt(0) || s[1].charAt(0) == s[2].charAt(0) || s[0].charAt(0) == s[2].charAt(0)) {
            System.out.println("PONIX");
        } else if (cnt == 3) {
            System.out.println("GLOBAL");
        } else {
            System.out.println("PONIX");
        }
    }
}
