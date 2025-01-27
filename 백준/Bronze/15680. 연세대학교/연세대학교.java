import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = (n == 0) ? "YONSEI" : "Leading the Way to the Future";
        System.out.println(result);
    }
}
