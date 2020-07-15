package basicArr.step05;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1
		// 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int temp = 0;
		int idx1 = 0;
		int idx2 = 0;

		System.out.println("\n문제1>>>");
		System.out.print("인덱스 입력[0~4]: ");
		int idx = sc.nextInt();
		System.out.print("변경할 인덱스 입력[0~4]: ");
		int changeIdx = sc.nextInt();

		if (idx != changeIdx) {
			temp = arr[idx];
			arr[idx] = arr[changeIdx];
			arr[changeIdx] = temp;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("인덱스가 같습니다. 다시 선택하세요");
		}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40
		// 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		System.out.println("\n문제2>>>");

		System.out.print("값1 입력: ");
		int num1 = sc.nextInt();
		System.out.println("값2 입력: ");
		int num2 = sc.nextInt();

		temp = 0;
		idx1 = 0;
		idx2 = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] == num1) {
				idx1 = i;
			}
			if (arr[i] == num2) {
				idx2 = i;
			}
		}
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002
		// 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}

		temp = 0;
		idx1 = 0;
		idx2 = 0;
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		System.out.println("문제3>>>");
		System.out.print("학번1 입력: ");
		int hakbun1 = sc.nextInt();
		System.out.print("학번2 입력: ");
		int hakbun2 = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == hakbun1) {
				idx1 = i;
			}

			if (hakbuns[i] == hakbun2) {
				idx2 = i;
			}
		}

		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;

		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}

	}

}
