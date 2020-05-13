package stepTest;

import java.util.Random;

/*
 * 메뉴 뽑기 프로그램
 * 메뉴: 닭곰탕, 순대국, 칼국수, nc백화점, 순두부, 만두집, 돈가스, 김치찌게, 구내식당
 * 
 * 구현:
 * - 현재 날짜와 요일을 출력.
 * - DB에 저장된 메뉴를 랜덤으로 돌린다.
 * - 결과(메뉴이름, 날짜요일)를 DB에 저장.
 * - 먹은 메뉴의 횟수 저장 및 list 만들기
 * - 1달동안 많이 먹은 메뉴 best 3위 구하기
 * 
 * 조건:
 * - 5일동안 같은 메뉴를 1번이상 먹을 수 없음
 * - 5일동안 1번이상 먹은 메뉴는 뽑기에서 제외
 */
public class Menu {

	public static void main(String[] args) {
		Random ran = new Random();
		String[] menu = { "닭곰탕", "순대국", "칼국수", "nc백화점", "순두부", "만두집", "돈가스", "김치찌게", "구내식당", "시래기집" };
		int eat = 0;

		boolean run = true;
		while (run) {
			String[] day = { "월", "화", "수", "목", "금" };

			int idx = ran.nextInt(5);
			int food = ran.nextInt(10);

			if (eat > 0) {
				System.out.println(" 메뉴: " + menu[food] + "는 이미 먹었습니다");
			}

			if (eat == 0) {
				System.out.println("(" + day[idx] + ")" + " 메뉴: " + menu[food]);
				eat += 1;
			}
			run = false;
		}

	}
}
