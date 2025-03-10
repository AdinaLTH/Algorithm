import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int str = s.charAt(0);
        int i = "I".charAt(0);

        System.out.println(Math.abs(str-i) + 84);
    }
}
