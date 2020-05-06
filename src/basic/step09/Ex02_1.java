package basic.step09;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

public class Ex02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("메뉴 선택 : ");
		int selectNum = sc.nextInt();

		int charge = 0;

		// 1. 불고기버거
		if (selectNum == 1) {
			System.out.println("결제할 금액:\t" + price1 + "원");
			int pay = sc.nextInt();
			charge = pay - price1;

			if (pay >= price1) {
				System.out.println("결제가 완료되었습니다.");
				System.out.println("거스름돈:\t" + charge + "원");
			}

			if (pay < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}

		// 2. 새우 버거
		if (selectNum == 2) {
			System.out.println("결제할 금액:\t" + price2 + "원");
			int pay = sc.nextInt();
			charge = pay - price2;

			if (pay >= price2) {
				System.out.println("결제가 완료되었습니다.");
				System.out.println("거스름돈:\t" + charge + "원");
			}
			if (pay < price2) {
				System.out.println("현금이 부족합니다.");
			}
		}

		// 3. 콜라
		if (selectNum == 3) {
			System.out.println("결제할 금액:\t" + price3 + "원");
			int pay = sc.nextInt();
			charge = pay - price3;

			if (pay >= price3) {
				System.out.println("결제가 완료되었습니다.");
				System.out.println("거스름돈:\t" + charge + "원");
			}
			if (pay < price3) {
				System.out.println("현금이 부족합니다.");
			}
		}

	}
}
