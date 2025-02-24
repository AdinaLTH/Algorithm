import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String initialString = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : initialString.toCharArray()) {
            leftStack.push(c);
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (command.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (command.startsWith("P")) {
                char c = command.split(" ")[1].charAt(0);
                leftStack.push(c);
            }
        }

        for (char c : leftStack) {
            bw.write(c);
        }
        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
    }
}