import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[5];

        for (int i = 0; i < 5; i++) {
            s[i] = br.readLine();
        }

        int maxLen = 0;
        for (String str : s) {
            if (str.length() > maxLen) {
                maxLen = str.length();
            }
        }

        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < s[i].length()) {
                    System.out.print(s[i].charAt(j));
                }
            }
        }
    }
}
