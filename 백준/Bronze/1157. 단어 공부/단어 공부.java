import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine().toUpperCase();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            arr[c-'A'] += 1;
        }

        int max = -1;
        char ch = '?';
        for (int i=0; i<26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
