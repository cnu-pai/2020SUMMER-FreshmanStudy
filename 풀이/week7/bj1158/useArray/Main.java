package bj1158;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] testCase = br.readLine().split(" ");
        int N = Integer.parseInt(testCase[0]);
        int K = Integer.parseInt(testCase[1]);
        int[] data = new int[N];
        boolean[] isRemove = new boolean[N];
        for (int i = 1; i <= N; i++) {
            data[i - 1] = i;
        }
        int index = -1;
        bw.write("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                index++;
                if (index == N) {
                    index = 0;
                }
                if (isRemove[index]) {
                    j--;
                }
            }
            isRemove[index] = true;
            if (i != N - 1)
                bw.write(data[index] + ", ");
            else
                bw.write(data[index] + "");
        }
        bw.write(">");
        bw.flush();
    }
}
