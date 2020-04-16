package step09;
/*
 * # 변수의 생명주기(Scope)
 */

// 강사님 설명 필요부분**

public class Ex01 {

	public static void main(String[] args) {
		int x = 10; // iv(instance variable), 인스턴스변수

		if (true) {
			System.out.println("x = " + x);
			int y = 20; // lv(local variable), 지역변수
			System.out.println("y = " + y);
		}
		// System.out.println("y = " + y); // y는 지역변수이므로 에러 발생
	}

}
