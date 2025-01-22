import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] allIngredients = br.readLine().split(" ");
        String[] usedIngredients = br.readLine().split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : allIngredients) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : usedIngredients) {
            map.put(s, map.get(s) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}