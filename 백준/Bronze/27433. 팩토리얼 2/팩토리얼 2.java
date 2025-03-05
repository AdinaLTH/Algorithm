import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger fact = BigInteger.valueOf(1);
        if (n==0) n=1;

        for (int i=n; i>0; i--) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);
    }
}
