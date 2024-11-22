import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum = new BigInteger("0");
        for(int i=1; i<=5; i++) {
            BigInteger n = sc.nextBigInteger();
            sum = sum.add(n);
        }
        System.out.println(sum);
    }
}