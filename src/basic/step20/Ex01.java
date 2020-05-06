package basic.step20;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean exit = true;
		// int exit = 0; // 위와 같은 방식임

		boolean run = true;
		while (run) {
			System.out.println("====쇼핑몰====");
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				exit = true;
				while (exit) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");

					System.out.println("세부메뉴 선택 : ");
					int mSel = sc.nextInt();

					if (mSel == 1) {
						System.out.println("티셔츠");
					} else if (mSel == 2) {
						System.out.println("바지");
					} else if (mSel == 3) {
						exit = false;
					}
				}

			} else if (sel == 2) {
				exit = true;
				while (exit) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");

					System.out.println("세부메뉴 선택 : ");
					int wSel = sc.nextInt();

					if (wSel == 1) {
						System.out.println("가디건");
					} else if (wSel == 2) {
						System.out.println("치마");
					} else if (wSel == 3) {
						exit = false;
					}
				}

			} else if (sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}

}
