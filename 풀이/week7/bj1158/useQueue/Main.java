package bj1158;

import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] testCase = br.readLine().split(" ");
        int N = Integer.parseInt(testCase[0]);
        int K = Integer.parseInt(testCase[1]);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        bw.write("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                list.offer(list.poll());
            }
            int rem = list.poll();
            if (i != N - 1)
                bw.write(rem + ", ");
            else
                bw.write(rem + "");
        }
        bw.write(">");
        bw.flush();
    }
}
