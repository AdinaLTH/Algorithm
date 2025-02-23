import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        long totalSum = 0;
        long currentNumber = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                if (currentNumber > 999999) {
                    currentNumber = 999999;
                }
            } else {
                totalSum += currentNumber;
                currentNumber = 0;
            }
        }

        totalSum += currentNumber;

        System.out.println(totalSum);

        scanner.close();
    }
}