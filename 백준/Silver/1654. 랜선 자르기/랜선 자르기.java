import java.io.*;
import java.util.*;

public class Main {
    
    public static long findMaxLength(int K, int N, long[] cables) {
        long start = 1;
        long end = Arrays.stream(cables).max().getAsLong();

        while (start <= end) {
            long mid = (start + end) / 2L;
            long count = 0L;
            for (long cable : cables) {
                count += cable / mid;
            }

            if (count >= N) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int K = Integer.parseInt(firstLine[0]);
        int N = Integer.parseInt(firstLine[1]);

        long[] cables = new long[K];
        for (int i = 0; i < K; i++) {
            cables[i] = Long.parseLong(br.readLine());
        }

        System.out.println(findMaxLength(K, N, cables));
        br.close();
    }
}