package step08;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dbId = 1234;
		int dbPw = 1111;

		System.out.print("Id를 입력하세요: ");
		int id = sc.nextInt();

		if (dbId == id) {
			System.out.print("Pw를 입력하세요: ");
			int pw = sc.nextInt();

			if (dbPw == pw) {
				System.out.println("로그인 성공");
			}
			if (dbPw != pw) {
				System.out.println("Pw를 확인해주세요");
			}

		}

		if (id != dbId) {
			System.out.println("Id를 확인해주세요");
		}

	}

}
