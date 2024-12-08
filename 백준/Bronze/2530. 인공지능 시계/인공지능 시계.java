import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int second1 = sc.nextInt();
        int s = sc.nextInt();

        int second2 = (second1 + s % 60) % 60;
        int carryMinuteFromSecond = (second1 + s % 60) / 60;

        int minute2 = (minute1 + s / 60 % 60 + carryMinuteFromSecond) % 60;
        int carryHourFromMinute = (minute1 + s / 60 % 60 + carryMinuteFromSecond) / 60;

        int hour2 = (hour1 + s / 3600 + carryHourFromMinute) % 24;

        System.out.println(hour2 + " " + minute2 + " " + second2);
    }
}