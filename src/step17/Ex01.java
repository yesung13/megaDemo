package step17;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("ID/PW 입력: ");
				int acc = sc.nextInt();
				int pw = sc.nextInt();
				if (log == -1) {
					if (acc == dbAcc1 && pw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + " 님 환영합니다.");

					} else if (acc == dbAcc2 && pw == dbPw2) {
						log = 2;
						System.out.println(dbAcc1 + " 님 환영합니다.");

					} else {
						System.out.println("ID 또는 PW가 틀립니다.");
					}
				} else {
					System.out.println("이미 로그인된 계정입니다.");
				}

			} else if (sel == 2) {
				if (log == 1 || log == 2) {
					log = -1;
					System.out.println("로그아웃 완료");
				} else if (log == -1) {
					System.out.println("로그인을 해주세요.");
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
