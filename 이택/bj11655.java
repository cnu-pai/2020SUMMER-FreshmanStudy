//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class test {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] input = br.readLine().split("");
//		String[] answer1;
//		char[] smallAlpha = new char[26];
//		char[] bigAlpha = new char[26];
//		int count1 = 0;
//		int count2 = 0;
//		for (int i = 65; i < 91; i++) {
//			bigAlpha[count1] = (char) i;
//			count1++;
//		}
//		for (int i = 97; i < 123; i++) {
//			smallAlpha[count2] = (char) i;
//			count2++;
//		}
//		answer1 =q(input);
//		for (int i = 0; i < answer1.length; i++) {
//			System.out.print(answer1[i] + " ");
//		}
//
//	}
//	private static String[] q(String[] input) {
//		String[] answer = new String[input.length];
//		
//		for (int i = 0; i < input.length; i++) {
//			String k = "";
//			for (int j = 0; j < input[i].length(); i++) {
//				int number = 0;
//				int decision = 0;
//				String imit = input[i];
//
//				if (Character.isUpperCase(imit.charAt(j))) {
//					if ((int) imit.charAt(j) + 13 > 90) {
//						number = ((int) imit.charAt(j)) + 13;
//						number = number - 65;
//						number = ((int) imit.charAt(j)) + 13 - number;
//					} else {
//						number = ((int) imit.charAt(j)) + 13;
//					}
//				} else if (Character.isLowerCase((imit.charAt(j)))) {
//					if ((int) imit.charAt(j) + 13 > 122) {
//						number = ((int) imit.charAt(j)) + 13;
//						number = number - 97;
//						number = ((int) imit.charAt(j)) + 13 - number;
//					} else {
//						number = ((int) imit.charAt(j)) + 13;
//					}
//				} else {
//					decision = 1;
//				}
//				if (decision == 1) {
//					k += imit.charAt(j);
//				} else {
//					k += (char) number;
//				}
//				answer[i] = k;
//			}
//		}
//		return answer;
//	}
//}
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] answer = new String[input.length()];

        char[] smallAlpha = new char[26];
        char[] bigAlpha = new char[26];
        int count1 = 0;
        int count2 = 0;
        for (int i = 65; i < 91; i++) {
            bigAlpha[count1] = (char) i;
            count1++;
        }
        for (int i = 97; i < 123; i++) {
            smallAlpha[count2] = (char) i;
            count2++;
        }
        String k = "";
        for (int i = 0; i < input.length(); i++) {
            int number = 0;
            int decision = 0;
            if (input.charAt(i)==' '){
                k+=" ";
            }
            else{
                if (Character.isUpperCase(input.charAt(i))) {
                    if ((int) input.charAt(i) + 13 > 90) {
                        number=(int) input.charAt(i)-13;
                    } else {
                        number = ((int) input.charAt(i)) + 13;
                    }
                } else if (Character.isLowerCase((input.charAt(i)))) {
                    if ((int) input.charAt(i) + 13 > 122) {
                        number=(int) input.charAt(i)-13;
                    } else {
                        number = ((int) input.charAt(i)) + 13;
                    }
                } else {
                    decision=1;
                }
                if (decision == 1) {
                    k += input.charAt(i);
                } else{
                    k += (char) number;
                }

            }
        }
        System.out.println(k);
    }
}
