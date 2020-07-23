package basicArr.step10;

import java.util.Scanner;
/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;

		boolean run = true;
		while (run) {
			System.out.print("계정 => ");
			for (int i = 0; i < cnt; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.println();

			System.out.print("암호 => ");
			for (int i = 0; i < cnt; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();

			System.out.println("===ATM===");
			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("더 이상 가입할 수 없습니다.");
					continue; // while문의 조건문으로 이동(run)
				}

				System.out.print("[가입]계좌번호 입력: ");
				int myAcc = sc.nextInt();

				int check = 1;

				for (int i = 0; i < cnt; i++) {
					if (accs[i] == myAcc) {
						check = -1;
					}
				}

				if (check == -1) {
					System.out.println("이미 존재하는 계정입니다.");
				} else {
					System.out.print("[가입]패스워드 입력: ");
					int pw = sc.nextInt();

					accs[cnt] = myAcc;
					pws[cnt] = pw;
					cnt += 1;
					
					System.out.println("가입완료!!!");
				}

			} else if (sel == 2) {
				System.out.print("[탈퇴]계좌번호 입력: ");
				int myAcc = sc.nextInt();

				int check = -1;

				for (int i = 0; i < cnt; i++) {
					if (accs[i] == myAcc) {
						check = i;
					}
				}

				if (check == -1) {
					System.out.println("해당 계좌번호가 존재하지 않습니다.");
				} else {
					// 질문
					for (int i = check; i < cnt - 1; i++) {
						accs[i] = accs[i + 1];
						pws[i] = pws[i + 1];
					}
					accs[cnt] = 0;
					pws[cnt] = 0;
					cnt -= 1;
				}

			}

		}

	}
}
