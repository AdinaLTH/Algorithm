import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static String checkNumbers(int n, int[] cards, int m, int[] numbers) {    
        Set<Integer> cardSet = new HashSet<>();
        Arrays.stream(cards).forEach(cardSet::add);
        return Arrays.stream(numbers)
                .mapToObj(num -> cardSet.contains(num) ? "1" : "0")
                .collect(Collectors.joining(" "));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] numbers = new int[M];
        for (int i = 0; i < M; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println(checkNumbers(N, cards, M, numbers));
        sc.close();
    }
}