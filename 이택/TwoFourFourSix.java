import java.util.Scanner;
public class TwoFourFourSix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int star = (2*(number-1))+1;
		int im = star;  //im은 증가하는 별의 개수 출력하는 while문 조건으로 사용하기 위해준비
		int space = 1;
		while(star>0) { //1개의 별을 만들때까지 돌도록 하기
			for(int k = 1; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if(star!=1) {//다음줄 띄어쓰기 하는 것
				for(int j =1; j<=space; j++) {
					System.out.print(" ");
				}
			}
			star-=2;
			space++;
		}
		star += 2; //1로 만들기 위한것
		space-=3; //띄어쓰기 맞추기 위한것

		int reach =3; // 와일문 조건 충족시키위한 변수

		while(reach!=im+2) {
			if(number == 1) { //입력받은 수가 1이라면 빠져나오기  그렇지 않으면 
				break;
			}
			else {
				for(int j = 1; j<=space; j++) {
					System.out.print(" ");
				}
				for(int i = 1; i<=reach; i++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			reach += 2;
			space--;
		}
	}
}
