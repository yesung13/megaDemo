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

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("메뉴를 선택하세요 : ");
		int choice = sc.nextInt();

		System.out.print("현금을 입력하세요 : ");
		int money = sc.nextInt();

		int charge = 0; // 초기화를 0으로 하는 이유는 if문안에 사용할 경우 저장하는 값이 다르므로 초기화 하여 사용

		// 방법1) money 변수가 money<price1 까지 영향을 미친다. 잘못된 방법인거 같음

		// 1. 불고기버거
		if (choice == 1) {

			if (money >= price1) {
				money = money - price1;
				System.out.println("결제가 완료되었습니다.");
				System.out.println("잔돈:\t" + money + "원");
			}

			if (money < price1) {
				System.out.println("현금이 부족합니다.");
			}
		}

		// 2. 새우 버거
		if (choice == 2) {

			if (money >= price2) {
				charge = money - price2;
				System.out.println("결제가 완료되었습니다.");
				System.out.println("잔돈:\t" + charge + "원");
			}
			if (money < price2) {
				System.out.println("현금이 부족합니다.");
			}
		}

		// 3. 콜라
		// if (choice == 3) {
		//
		// if (money >= price3) {
		// charge = money - price3;
		// System.out.println("결제가 완료되었습니다.\t");
		// System.out.println("잔돈:\t" + charge + "원");
		// }
		// if (money < price3) {
		// System.out.println("현금이 부족합니다.");
		// }
		// }

		if (choice == 3) {
			charge = money - price3;
		}
		
		if(charge >= 0) {
			System.out.println("잔돈 : "+charge+"원");
		}
		if(charge < 0) {
			System.out.println("현금이 부족합니다.");
		}

	}
}
