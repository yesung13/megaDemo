package basicArr.step04;

import java.util.Scanner;

/*
 * [문제]복습
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		int idx2 = 0;
		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		// 문제2) 점수를 입력하면 학번 출력
		System.out.println(">>>문제1");
		System.out.print("학번 입력: ");
		int hakbun = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			if (arr[i] == hakbun) {
				idx = i + 1;
				System.out.println("[학번]: " + arr[i] + " [점수]: " + arr[idx]);
			}
		}

		System.out.println("\n>>>문제2");

		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		for (int i = 0; i < 6; i++) {
			if (arr[i] == score) {
				idx = i - 1;
				System.out.println("[학번]: " + arr[i] + " [점수]: " + arr[idx]);
			}
		}

		System.out.println("------------------------------------");
		int scores[] = { 1001, 20, 43, 1002, 54, 2, 1003, 76, 6 };
		// 학번과 국어 수학 점수이다
		// 예) 1001 == (20 , 43)
		// 1002 == (54 , 2)
		// 1003 == (76 , 6)
		// 문제3) 점수의 합을 입력하면 번호 출력
		// 예) 63 ==> 1001
		// 예) 56 ==> 1002
		// 예) 82 ==> 1003
		System.out.println("\n>>>문제3");

		int[] tot = new int[8];
		int sum = 0;
		// System.out.println("====목록====");
		// for (int i = 0; i < 9; i++) {
		// System.out.print("[" + i + "]" + scores[i] + "\t");
		// if (i < 8) {
		// idx2 = i;
		// idx = idx + 1;
		// sum = scores[i] + scores[idx];
		// tot[i] = sum;
		// System.out.print("[" + i + "]" + tot[i]);
		// System.out.println("\t");
		// }
		// }

		System.out.println("점수의 합: ");
		int answer = sc.nextInt();

		idx = 0;
		idx2 = 0;
		int idx3 = 0;
		for (int i = 0; i < 9; i++) {

			if (i < 8) {
				idx2 = i; // [i] 0~8을 저장
				idx = idx + 1; // [i+1]

				// [i] + [i+1] 값을 더하여 그 값을 sum 변수에 저장 후 tot[i]배열에 저장
				sum = scores[i] + scores[idx];
				tot[i] = sum;
				if (answer == tot[idx2]) {
					idx3 = idx2 - 1; // scores배열의 값을 뽑기 위함
					System.out.println("점수: " + tot[idx2] + " ==> 학번: " + scores[idx3]);
				}
			}
		}

	}
}
