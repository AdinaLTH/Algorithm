import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "long";
        for(int i=0; i<n/4; i++){
            System.out.print(a + " ");
        }
        System.out.println("int");
    }
}