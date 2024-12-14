import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i<T; i++) {
            int H = sc.nextInt(); //층 수
            int W = sc.nextInt(); //각 층의 방 수
            int N = sc.nextInt(); //몇 번째 손님

            int Y = N%H; //층 수
            int X = N/H; //호실

            if (Y == 0) {
                if (X < 10) System.out.println(H+"0"+X);
                else System.out.println(H+""+X);
            } else {
                X++;
                if (X < 10) System.out.println(Y+"0"+X);
                else System.out.println(Y+""+X);
            }
        }
    }
}