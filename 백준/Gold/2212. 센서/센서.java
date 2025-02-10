import java.util.*;
import java.io.*;

public class Main {
    public static int minSensorRange(int n, int k, int[] sensors) {
        Arrays.sort(sensors);

        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            distances.add(sensors[i] - sensors[i-1]);
        }

        Collections.sort(distances);

        int result = sensors[n-1] - sensors[0];

        for (int i = 0; i < Math.min(k-1, n-1); i++) {
            result -= distances.get(distances.size()-i-1);
        }

        return Math.max(0,result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] sensors = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(minSensorRange(n, k, sensors));
    }
}