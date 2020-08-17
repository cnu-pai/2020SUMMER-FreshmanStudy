import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class bj1975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Case = Integer.parseInt(br.readLine());
        int number;
        int[] cr = new int[Case]; //각 케이스마다입력받은 수를 (약수)진법으로 바꿨을 때 마지막에 연속되는 0의 개수를 넣기 위해 정의함
        int crCount=0;
        for (int i = 1; i <= Case; i++) { // 케이스 만큼 입력받는다
            number = Integer.parseInt(br.readLine());
            if(number == 1){
                cr[crCount]=0;
                crCount++;
                continue;
            }
            int[] Anumber = new int[number - 1]; // 2부터 입력받은 수까지 입력받은 수의 약수를 넣기 위한 배열
            int count = 0;
            for (int j = 2; j <= number; j++) {
                if (number % j == 0) {
                    Anumber[count] = j; // 입력받은 수의 약수를 넣는다
                    count++;
                }
            }
            int total = 0; //입력받은 수의 약수에 대해 총 마지막 0의 개수가 몇개인지 세기위한 변수
            for (int j = 0; j < count; j++) {
                int answer = Anumber[j];
                int Change = wlsqjq(number, answer); // 입력받은 수를 그냥 (약수의 수)진법으로 변환하여 변수에 넣어주고
                int counting = 0; //각각 약수마다 마지막 0의 개수 몇개인지 세기위한 변수
                String sChange = Integer.toString(Change);
                for (int r = sChange.length() - 1; r >= 1; r--) {
                    if (sChange.charAt(r) == '0') {
                        counting++;
                    } else {
                        break;
                    }
                }
                total += counting;
            }
            cr[crCount]=total;
            crCount++;

        }
        for (int j =0; j<cr.length; j++){
            System.out.println(cr[j]);
        }
    }

    private static int wlsqjq(int number, int dirtn) {
        int k = 1;
        int q = 0;
        int imit = number;
        while (imit > 0) {
            q += imit % dirtn * k;
            imit = (int) Math.floor((double) imit / (double) dirtn);
            k *= 10;
        }
        return q;
    }
}