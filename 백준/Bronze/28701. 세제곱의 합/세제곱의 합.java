import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum1=0, sum2=0, sum3=0;
        for (int i=1; i<=n; i++) {
            sum1 += i;
            sum3 += (int) Math.pow(i, 3);
        }
        sum2 = (int) Math.pow(sum1, 2);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
