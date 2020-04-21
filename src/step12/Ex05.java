package step12;

import java.util.Scanner;

//생각이 필요했음 20분
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		int cash = 20000; // 입금시 감소 , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용

		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int selectMenu = sc.nextInt();

		if (selectMenu == 1) {
			System.out.println("========로그인========");
			System.out.print("ID:\t");
			int setAccount = sc.nextInt();
			System.out.print("PW:\t");
			int setPassword = sc.nextInt();
			System.out.println("======================");

			if (setAccount == account && setPassword == password) {
				System.out.println(account + "님 반갑습니다. 원하시는 작업을 선택해주세요.");
				System.out.println("1.입금 2.출금 3.조회");
				selectMenu = sc.nextInt();

				// 입금
				if (selectMenu == 1) {
					System.out.print("입금할 금액: ");
					int deposit = sc.nextInt();

					cash = cash - deposit;
					balance = balance + deposit;
					System.out.println("입금이 완료되었습니다" + "\n =>입금 금액: " 
					+ deposit + "원" + "\n =>계좌 잔액: " + balance + "원");

					// 출금
				} else if (selectMenu == 2) {
					System.out.print("출금할 금액: ");
					int withdraw = sc.nextInt();

					cash = cash + withdraw;
					balance = balance - withdraw;
					System.out.println("출금이 완료되었습니다." + "\n =>출금 금액: " 
					+ withdraw + "원" + "\n =>계좌 잔액: " + balance + "원");

					// 조회
				} else if (selectMenu == 3) {
					System.out.println("계좌 잔액: " + balance + "원");
				}

			} else {
				System.out.println("ID 또는 PW가 잘못되었습니다.");
			}

		} else {
			System.out.println("종료합니다");
		}

	}
}
