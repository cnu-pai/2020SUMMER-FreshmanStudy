import java.util.Scanner;
public class OneZeroEightFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,w,h;
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		int row1,col1,row2,col2; //row : 가로길이  col : 세로길이
		row1 = x;
		col1 = y;
		row2 = w-x;
		col2 = h-y;
		
		if(row1<=row2 && row1<=col1 && row1<=col2) {
			System.out.println(row1);
		}
		else if(row2<=row1 && row2<=col1 && row2<=col2) {
			System.out.println(row2);
		}
		else if(col1<=col2 && col1<=row1 && col1<=row2) {
			System.out.println(col1);
		}
		else if(col2<=col1 && col2<=row1 && col2<=row2) {
			System.out.println(col2);
		}

//		if(row1<row2) {
//			if(row1<col1) {
//				System.out.println(row1);
//			}
//			else {
//				System.out.println(col1);
//			}
//		}
//		else {
//			if(row2<col2) {
//				System.out.println(row2);
//			}
//			else {
//				System.out.println(col2);
//			}
//		}
	}

}
