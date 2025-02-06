import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<Integer> A = new LinkedList<>();
        List<Integer> B = new LinkedList<>();
        Queue<int[]> list = new LinkedList<>();

        int[] member;
        int type, a, b;
        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            type = Integer.parseInt(st.nextToken());

            switch (type) {
                case 1:
                    a = Integer.parseInt(st.nextToken());
                    b = Integer.parseInt(st.nextToken());
                    member = new int[2];
                    member[0] = a;
                    member[1] = b;

                    list.add(member);
                    break;

                case 2:
                    b = Integer.parseInt(st.nextToken());
                    member = list.poll();

                    if (member[1] == b) {
                        A.add(member[0]);
                    } else {
                        B.add(member[0]);
                    }

                    break;
            }
        }

        if (A.size() == 0) {
            sb.append("None");
        } else {
            Collections.sort(A);

            for (int num : A) {
                sb.append(num).append(" ");
            }
        }

        sb.append("\n");

        if (B.size() == 0) {
            sb.append("None");
        } else {
            Collections.sort(B);

            for (Integer num : B) {
                sb.append(num).append(" ");
            }
        }

        sb.append("\n");

        if (list.size() == 0) {
            sb.append("None");
        } else {
            List<Integer> C = new LinkedList<>();

            while (!list.isEmpty()) {
                C.add(list.poll()[0]);
            }

            Collections.sort(C);
            for (Integer num : C) {
                sb.append(num).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
