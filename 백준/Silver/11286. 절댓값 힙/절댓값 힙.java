import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) return o1 - o2;
                else return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i = 0; i < n; i ++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                int out = pQueue.isEmpty() ? 0 : pQueue.poll();
                System.out.println(out);
            }
            else pQueue.offer(x);
        }
    }
}