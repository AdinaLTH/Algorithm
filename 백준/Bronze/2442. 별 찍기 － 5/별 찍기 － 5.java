import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n+1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n*2-1; j++) {
                if (i+j<n+1 || i+j==cnt+1) {
                    System.out.print(" ");
                } else if (i+j==n+1 || i+j<=cnt){
                    System.out.print("*");
                }
            }
            cnt+=2;
            System.out.println();
        }
    }
}
