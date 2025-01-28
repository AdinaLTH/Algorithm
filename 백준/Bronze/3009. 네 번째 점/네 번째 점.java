import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int fourthX = findFourthPoint(x);
        int fourthY = findFourthPoint(y);

        System.out.println(fourthX + " " + fourthY);
    }

    private static int findFourthPoint(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        } else if (arr[0] == arr[2]) {
            return arr[1];
        } else {
            return arr[0];
        }
    }
}