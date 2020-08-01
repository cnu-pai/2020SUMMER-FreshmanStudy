import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj1296 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String manName = br.readLine();
        int number = Integer.parseInt(br.readLine());
        String[] womanName = new String[number];
        int[] result = new int[number];

        int count = 0;
        while (count != number) {
            womanName[count] = br.readLine();
            int[] wL = Divide(womanName[count], manName);
            int calculate = ((wL[0] + wL[1]) * (wL[0] + wL[2]) * (wL[0] + wL[3]) * (wL[1] + wL[2]) * (wL[1] + wL[3]) * (wL[2] + wL[3])) % 100;
            result[count] = calculate;
//         System.out.println(result[count]);
            count++;
        }
        int[] answer = l(number, result);
        int hwakin = 0;        for (int i = 0; i < number; i++) {
            if (answer[i] == 1) {
                hwakin++;
            }
        }

        String[] newWomanName = new String[hwakin];
        hwakin=0;
        for (int i = 0; i < number; i++) {
        	if (answer[i]==1) {
        		newWomanName[hwakin] = womanName[i];
        		hwakin ++;
        	}
        }

        Arrays.sort(newWomanName);
        System.out.println(newWomanName[0]);
    }

    public static int[] l(int number, int[] result) {
        int max = 0;
        int[] k = new int[number];
        int counting = 0;
        for (int i = 0; i < number; i++) {
            if (result[i] > max) {
//            System.out.println(max);
                max = result[i];
            }
        }
        for (int i = 0; i < number; i++) {
            if (result[i] == max) {
                k[i]++;
            }
        }
        return k;
    }

    public static int[] Divide(String a, String b) {
        String[] oneAndOne = new String[a.length()];
        int[] LOVE = new int[4];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'L') {
                LOVE[0]++;
            } else if (a.charAt(i) == 'O') {
                LOVE[1]++;
            } else if (a.charAt(i) == 'V') {
                LOVE[2]++;
            } else if (a.charAt(i) == 'E') {
                LOVE[3]++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'L') {
                LOVE[0]++;
            } else if (b.charAt(i) == 'O') {
                LOVE[1]++;
            } else if (b.charAt(i) == 'V') {
                LOVE[2]++;
            } else if (b.charAt(i) == 'E') {
                LOVE[3]++;
            }
        }

        return LOVE;
    }
}