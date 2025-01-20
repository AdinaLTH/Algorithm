import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            if (map.containsKey(s[0])) {
                map.put(s[0], map.get(s[0]) + Integer.parseInt(s[1]));
            } else {
                map.put(s[0], Integer.parseInt(s[1]));
            }
        }
        
        if(map.containsValue(5)) System.out.println("YES");
        else System.out.println("NO");
    }
}