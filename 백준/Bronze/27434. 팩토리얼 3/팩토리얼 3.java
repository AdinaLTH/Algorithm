import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(1, n));
    }

    public static BigInteger factorial(int a, int n){
        BigInteger num = BigInteger.valueOf(a);
        if (a < n){
            int b = (a + n) / 2;
            num = factorial(a,b).multiply(factorial(b+1, n));
        }
        
        return num;
    }
}