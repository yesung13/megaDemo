package basic.step17;

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
		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		int money = 0;

		boolean run = true;
		while (run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("입금할 금액: ");
				money = sc.nextInt();
				myMoney = myMoney + money;
				System.out.println(money + "원 입금완료");

			} else if (sel == 2) {
				System.out.println("출금할 금액: ");
				money = sc.nextInt();

				if (myMoney >= money) {
					myMoney = myMoney - money;
					System.out.println(money + "원 출금완료");
				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (sel == 3) {
				System.out.print("이체할 계좌번호 입력: ");
				int acc = sc.nextInt();

				if (acc == yourAcc) {
					System.out.print("이체할 금액: ");
					money = sc.nextInt();

					if (myMoney >= money) {
						myMoney = myMoney - money;
						yourMoney = yourMoney + money;
						System.out.println(money + "원 이체완료");

					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("계좌번호를 다시 입력해주세요.");
				}
			} else if (sel == 4) {
				System.out.println(myAcc + "님의 잔액: " + myMoney + "원");
				System.out.println(yourAcc + "님의 잔액: " + yourMoney + "원");

			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}

}
