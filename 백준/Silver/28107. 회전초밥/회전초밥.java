import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static PriorityQueue<Customer> customer;
    static PriorityQueue<Integer> sushi;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        customer = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            
            while(number-->0) {
                int susi = Integer.parseInt(st.nextToken());
                customer.add(new Customer(susi, i));
            }
        }

        answer = new int[n];
        st = new StringTokenizer(br.readLine());
        sushi = new PriorityQueue<>();
        
        while (m-->0) {
            sushi.add(Integer.parseInt(st.nextToken()));
        }

        while (!sushi.isEmpty()) {
            int susi = sushi.poll();

            while (!customer.isEmpty() && customer.peek().susi < susi) {
                customer.poll();
            }

            if (!customer.isEmpty() && customer.peek().susi == susi) {
                Customer c = customer.poll();
                answer[c.number] += 1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }

    }
    
    public static class Customer implements Comparable<Customer> {
        int susi;
        int number;

        Customer(int susi, int number) {
            this.susi = susi;
            this.number = number;
        }

        public int compareTo(Customer customer) {
            
            if (this.susi == customer.susi) {
                return this.number - customer.number;
            }
            return this.susi - customer.susi;
        }
    }
}