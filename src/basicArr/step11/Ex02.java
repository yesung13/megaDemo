package basicArr.step11;
//# 삼각형 그리기

/*
 * 문제 1)
 * #
 * ##
 * ###
 */

/*
 * 문제 2)
 * ###
 * ##
 * #
 */

/*
 * 문제 3)
 * @##
 * @@#
 * @@@
 */

/*
 * 문제 4)
 *   #
 *  ###
 * #####
 */

/*
 * 예)
 * ###
 * ###
 * ###
 */
public class Ex02 {

	public static void main(String[] args) {
		// 예)
		// for (int i = 0; i < 9; i++) {
		// System.out.print("#");
		// if (i % 3 == 2) {
		// System.out.println();
		// }
		// }
		//
		// System.out.println();
		//
		// for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 3; j++) {
		// System.out.print("#");
		// }
		// System.out.println();
		// }

		System.out.println("문제 1)");
		for (int i = 3; i > 0; i--) {
			System.out.print("*");
			for (int j = i; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("문제 2)");
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			for (int j = i; j < 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("문제 3)");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}

			for (int j = 2; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println("문제 4)");
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print("@");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k += 2;
		}

	}

}
