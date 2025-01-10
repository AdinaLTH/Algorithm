import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            BigInteger a = new BigInteger(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            BigInteger n = a.modPow(BigInteger.valueOf(b), BigInteger.TEN);
            if (n == BigInteger.ZERO) {
                System.out.println(10);
            } else {
                System.out.println(n);
            }
        }
    }
}
