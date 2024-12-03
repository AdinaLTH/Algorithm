import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;

        for (int i=0; i<5; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] < 40) {
                scores[i] = 40;
            }
            sum += scores[i];
        }

        System.out.println(sum/5);
    }
}