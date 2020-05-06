package basic.step08;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력해주세요: ");
		int height = sc.nextInt();

		if (height >= 120) {
			System.out.println("놀이기구 이용 가능합니다");
		}

		if (height < 120) {
			System.out.println("부모님과 함께 오셨나요?(yes:1, no:0) : ");
			int parentsYn = sc.nextInt();
			if (parentsYn == 1) {
				System.out.println("놀이기구 이용 가능합니다");
			}
			if (parentsYn == 0) {
				System.out.println("놀이기구를 이용할 수 없습니다");
			}

		}

	}

}
