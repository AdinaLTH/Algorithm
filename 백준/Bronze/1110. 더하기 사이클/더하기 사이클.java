import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0, a, b, sum, answer = 0;
        int temp = n;
        while(true) {
            if (n>=10) {
                if (cnt == 0) a = temp/10;
                else a = answer%10*10;
                b = temp%10;
                sum = a+b;
                if (cnt == 0) answer = b*10 + sum%10;
                else answer = sum/10*10 + sum%10;
                temp = answer/10 + answer%10;
                cnt++;
                if(answer == n) break;
            }

            else {
                if (cnt == 0) a = 0;
                else a = answer%10*10;
                b = temp%10;
                sum = a+b;
                if (cnt == 0) answer = b*10 + sum%10;
                else answer = sum/10*10 + sum%10;
                temp = answer/10 + answer%10;
                cnt++;
                if(answer == n) break;
            }
        }

        System.out.println(cnt);
    }
}