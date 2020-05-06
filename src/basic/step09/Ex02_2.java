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


/*
 * Print문을 간소화하기 위해 price에 price1~3을 저장하여 출력하고,
 * 조건문을 사용하여 정상결제가 이뤄지면 양수
 * 그러지 못하면 음수가 나와 결제여부 판단하는 로직
 * 
 */
public class Ex02_2 {

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
		int price = 0;
		int pay = sc.nextInt();
		
		
		// 1. 불고기버거
		if (selectNum == 1) {
			price = price1;
			charge = pay - price1;
		}

		// 2. 새우 버거
		if (selectNum == 2) {
			price = price2;
			charge = pay - price2;
		}

		// 3. 콜라
		if (selectNum == 3) {
			price = price3;
			charge = pay - price3;
		}
		
		System.out.println("결제할 금액:\t" + price + "원");
		
		if (charge >= 0) {
			System.out.println("결제가 완료되었습니다.");
			System.out.println("거스름돈:\t" + charge + "원");
		}
		if (charge < 0) {
			System.out.println("현금이 부족합니다.");
		}

	}
}
