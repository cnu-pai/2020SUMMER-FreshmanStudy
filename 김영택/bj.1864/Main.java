import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String A = sc.nextLine();
            int sum = 0;
            if(A.equals("#")){
                break;
            }
            else{
                for(int i = 0; i < A.length(); i++){
                    int x = 0;
                    switch(A.charAt(i)){
                        case '-':
                            x = 0;
                            break;
                        case '\\':
                            x = 1;
                            break;
                        case '(':
                            x = 2;
                            break;
                        case '@':
                            x = 3;
                            break;
                        case '?':
                            x = 4;
                            break;
                        case '>':
                            x = 5;
                            break;
                        case '&':
                            x = 6;
                            break;
                        case '%':
                            x = 7;
                            break;
                        case '/':
                            x = -1;
                            break;
                    }
                    sum += Math.pow(8,(A.length() - 1 - i))*x;
                }
            }
            System.out.println(sum);
        }
    }
}