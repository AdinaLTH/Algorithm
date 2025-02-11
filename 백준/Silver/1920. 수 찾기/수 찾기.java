import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int query : queries) {
            if (binarySearch(arr, query)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
