package basicArr.step01;

/*
 * # 배열 기본문제
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		System.out.println("===10부터 50까지 arr 배열에 저장===");
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		for (int i = 0; i < 5; i++) {
			arr[i] = 10 * (i+1);
			System.out.println(arr[i]);
		}
		   
		// 문제2) 4의 배수만 출력
		// 정답2) 20 40
		System.out.println("\n===4의 배수만 출력===");
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}

		// 문제3) 4의 배수의 합 출력
		// 정답3) 60
		System.out.println("\n===4의 배수의 합 출력===");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);

		// 문제4) 4의 배수의 개수 출력
		// 정답4) 2
		System.out.println("\n===4의 배수의 개수 출력===");
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

		// 문제5) 짝수의 개수 출력
		// 정답5) 5
		System.out.println("\n===짝수의 개수 출력===");
		cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

	}
}
