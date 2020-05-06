package basic.step12;
/*
 * # ATM[1단계] : 이체하기

 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

//풀이 18:10 ~ 18:25 (15분)
import java.util.Scanner;

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		int setMoney = 0;
		System.out.print("이체할 계좌번호 입력: ");
		int setAccountNum = sc.nextInt();

		if (setAccountNum == yourAcc) {
			System.out.println("나의 계좌번호: " + myAcc + "\n계좌 잔액: " + myMoney);
			System.out.print("이체 금액 입력: ");
			setMoney = sc.nextInt();

			if (setMoney <= myMoney) {
				myMoney = myMoney - setMoney;
				yourMoney = yourMoney + setMoney;
				System.out.println("이체를 완료하였습니다.");

				System.out.println("=================이체 결과================");
				System.out.println("나의 잔액 = " + myMoney + "원");
				System.out.println("받은 사람 잔액 = " + yourMoney + "원");
				System.out.println("==========================================");

			} else if (setMoney > myMoney) {
				System.out.println("이체불가(잔액이 부족합니다)");
			}

		} else {
			System.out.println("계좌 번호가 일치하지 않습니다.");
		}
	}
}