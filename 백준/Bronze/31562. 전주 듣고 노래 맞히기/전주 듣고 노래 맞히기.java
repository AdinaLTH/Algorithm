import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> songToNotes = new HashMap<>();
        HashMap<String, Integer> notesCount = new HashMap<>();
        HashMap<String, String> notesToSong = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            st1.nextToken();
            String name = st1.nextToken();
            String[] notes = new String[3];
            for (int j = 0; j < 3; j++) {
                notes[j] = st1.nextToken();
            }
            String noteSt = String.join("", notes);
            songToNotes.put(name, noteSt);
            notesCount.put(noteSt, notesCount.getOrDefault(noteSt, 0) + 1);
            notesToSong.put(noteSt, name);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String[] notes = new String[3];
            for (int j = 0; j < 3; j++) {
                notes[j] = st2.nextToken();
            }
            String noteSt = String.join("", notes);

            if (!notesCount.containsKey(noteSt)) {
                bw.write("!");
            } else if (notesCount.get(noteSt) > 1) {
                bw.write("?");
            } else {
                bw.write(notesToSong.get(noteSt));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}