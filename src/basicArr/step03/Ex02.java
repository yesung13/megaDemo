package basicArr.step03;

import java.util.Scanner;

/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] seat = new int[7];

		boolean run = true;
		while (run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			int back = -1;

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("==좌석표==");

				System.out.print("seat\t= [");
				for (int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println("]");

				System.out.println("좌석을 선택하세요:");
				int choice = sc.nextInt();

				int cnt = 0;
				for (int i = 0; i < 7; i++) {
					if (seat[i] == choice) {
						System.out.println("이미 예매가 완료된 자리입니다.");
					} else {
						seat[i] = choice;
						cnt += 1;
					}
				}

			} else if (sel == 2) {
				run = false;
			}
		}

	}

}
