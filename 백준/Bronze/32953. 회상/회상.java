import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> studentCounts = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                String studentId = st.nextToken();
                studentCounts.put(studentId, studentCounts.getOrDefault(studentId, 0) + 1);
            }
        }

        int result = 0;
        for (int count : studentCounts.values()) {
            if (count >= M) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
