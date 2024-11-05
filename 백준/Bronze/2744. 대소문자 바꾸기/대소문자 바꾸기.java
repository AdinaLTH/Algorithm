import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        String s = sc.nextLine();
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i)<97){
                a = s.charAt(i)+32;
                System.out.print((char)a);
            }
            else {
                b = s.charAt(i)-32;
                System.out.print((char)b);
            }
        }
    }
}