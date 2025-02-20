import java.util.*;

public class Main {
    public static boolean canRecord(int[] lessons, int m, int size) {
        int count = 1;
        int currentSum = 0;

        for (int lesson : lessons) {
            if (lesson > size) {
                return false;
            }
            if (currentSum + lesson > size) {
                count++;
                currentSum = 0;  // 새로운 블루레이에 현재 강의 추가
            }
            currentSum += lesson;
        }

        return count <= m;  // 필요한 블루레이 개수 확인
    }

    public static int minBluraySize(int n, int m, int[] lessons) {
        int left = Arrays.stream(lessons).max().getAsInt();  // 가능한 최소 크기 (가장 긴 강의 길이)
        int right = Arrays.stream(lessons).sum();  // 가능한 최대 크기 (모든 강의 길이의 합)
        int result = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canRecord(lessons, m, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] lessons = new int[N];
        for (int i = 0; i < N; i++) {
            lessons[i] = sc.nextInt();
        }
        System.out.println(minBluraySize(N, M, lessons));
        sc.close();
    }
}