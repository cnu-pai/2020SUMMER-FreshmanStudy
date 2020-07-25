import java.util.Scanner;
public class TwoFiveEightEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int RealNumber2=number2; //마지막에 곱할떄 사용
		int check=100;
		int[] n1 = new int[3];     //필요없음
		int[] n2 = new int[3];
//		while(true) { 			   //필요없음
//			int count;
//			int value;
//			value = number1/check;
//			count=0;
//			n1[count]=value;
//			check/=10;
//			value++;
//			if(value==3) {
//				break;
//			}
//		}
		int count;
		int value;
		count=0;
		while(true) {
			value = number2/check;
			n2[count]=value;
//			System.out.println(n2[count]);
			number2-=check*value;
			check/=10;
			count++;
			if(check==0) {
				break;
			}
		}
		int value3, value4, value5, value6;
		value3 = number1*n2[2];
		value4 = number1*n2[1];
		value5 = number1*n2[0];
		value6 = RealNumber2*number1;
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
	}

}
