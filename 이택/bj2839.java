import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int c5, c3, total, count = 0;
        int decision = 0;
        int[] Arr5 = new int[10];
        int[] Arr3 = new int[10];


        c5 = (int) Math.ceil(number / 5);
        c3 = (int) Math.ceil(number / 3);

        int correct, mini = 5000;
        for (int i = 0; i <= c5; i++) {
            for (int j = 0; j <= c3; j++) {
                total = i * 5 + j * 3;
                if (total == number) {
                    decision = 1;
                    if (i + j < mini) {
                        mini = i + j;
                    }
                }
            }
        }
        if (decision == 1) {
            System.out.println(mini);
        } else {
            System.out.println(-1);
        }
    }
}

