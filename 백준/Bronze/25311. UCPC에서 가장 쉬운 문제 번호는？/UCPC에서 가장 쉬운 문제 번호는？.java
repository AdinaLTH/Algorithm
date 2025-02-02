import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        if (year==2018 || year==2019 || year==2020 || year==2021 || year==2022) System.out.println('A');
    }
}
