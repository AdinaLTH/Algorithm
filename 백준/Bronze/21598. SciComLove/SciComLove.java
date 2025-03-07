import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            System.out.println("SciComLove");
        }
    }
}
