import java.util.Scanner;
public class Main {
    public static int Rev(String x) {
    char[] b = new char[x.length()];
    char[] c = new char[x.length()];
    int y = 0;
    for (int i = 0; i < x.length(); i++) {
        b[i] = x.charAt(i);
        }
    for (int i = x.length() - 1; i >= 0; i--) {
        c[y] = x.charAt(i);
        y++;
        }
    for(int i = 0; i < x.length(); i++){
        if(b[i] != c[i]){
            return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(Rev(A));
    }
}