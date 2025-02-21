import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> result = new ArrayList<>();
        int satisfaction = 0;

        while (!pq.isEmpty()) {
            int top = pq.poll();
            satisfaction = (satisfaction / 2) + top;
            result.add(satisfaction);
            int next = top - M;
            
            if (next > K) {
                pq.add(next);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (int num : result) {
            sb.append(num).append("\n");
        }
        
        System.out.print(sb);
    }
}