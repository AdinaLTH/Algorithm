import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] blocks = new int[n][2];

        for (int i = 0; i < n; i++) {
            blocks[i][0] = sc.nextInt();
            blocks[i][1] = sc.nextInt();
        }

        System.out.println(fillBox(l, w, h, blocks));
    }

    public static int fillBox(int l, int w, int h, int[][] blocks) {
        Arrays.sort(blocks, (a, b) -> b[0] - a[0]);
        long totalCount = 0;
        long volume = (long) l * w * h;
        long usedVolume = 0;

        for (int i = 0; i < blocks.length; i++) {
            long size = (1 << blocks[i][0]);
            int count = blocks[i][1];

            if (volume <= usedVolume) {
                break;
            }

            long maxCount = (l/size) * (w/size) * (h/size);
            maxCount -= usedVolume / (size * size * size);
            long useCount = Math.min(count, maxCount);

            usedVolume += useCount * (size * size * size);
            totalCount += useCount;
        }

        if (usedVolume == volume) {
            return (int) totalCount;
        } else {
            return -1;
        }
    }
}

