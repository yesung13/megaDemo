package step05;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

public class Ex05 {

	public static void main(String[] args) {
		int dbId = 0;
		int dbPw = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("===회원가입===");
		System.out.println("id를 입력하세요");
		dbId = sc.nextInt();
		System.out.println("pw를 입력하세요");
		dbPw = sc.nextInt();

		System.out.println("===로그인===");
		System.out.print("id : ");
		int id = sc.nextInt();
		System.out.print("pw : ");
		int pw = sc.nextInt();

		if (id == dbId && pw == dbPw) {
			System.out.println("로그인 성공");
		}

		if (id != dbId || pw != dbPw) {
			System.out.println("로그인 실패");
		}
	}

}
