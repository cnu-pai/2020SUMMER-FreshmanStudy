import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double[] average = new double[A];
        double[] student = new double[A];
        for(int i = 0; i < A; i++){
            int sum = 0;
            int count = 0;
            int B = sc.nextInt();
            double[] score = new double[B];
            for(int j = 0; j < B; j++){
                score[j] = sc.nextInt();
                sum += score[j];
            }
            average[i] = (double)sum / B;
            for(int k = 0; k < B; k++){
                if(average[i] < score[k]){
                    count++;
                }
            }
            student[i] = (double)count/B*100.0;
        }
        for(int i = 0; i < A; i++){
            System.out.println(String.format("%.3f", student[i]) + "%");
        }
    }
}