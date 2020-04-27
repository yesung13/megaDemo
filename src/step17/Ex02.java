package step17;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int myMoney = 0;

		boolean run = true;
		while (run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");

			System.out.print("버튼 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("입금할 금액: ");
				int money = sc.nextInt();
				myMoney = myMoney + money;
				System.out.println(money + "원 입금이 완료되었습니다.");
				System.out.println("잔액: " + myMoney + "원");
				int deposit = myMoney;

			} else if (sel == 2) {
				System.out.print("출금할 금액: ");
				int withdraw = sc.nextInt();
				myMoney = myMoney - withdraw;

				System.out.println("");

			} else if (sel == 3) {

			} else if (sel == 4) {

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

}
