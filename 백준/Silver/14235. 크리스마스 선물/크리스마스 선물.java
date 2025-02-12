import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((x, y) -> y - x);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < a; j++) {
                pQueue.offer(Integer.parseInt(st.nextToken()));
            }

            if (a != 0) {
                continue;
            }

            if (!pQueue.isEmpty()) {
                sb.append(pQueue.poll()).append("\n");
            } else {
                sb.append(-1).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}
