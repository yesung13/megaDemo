package stepTest;

/*
 * #반복문 전체 테스트
 * 
 */
public class Test02 {

	public static void main(String[] args) {
		System.out.println("===9의 배수===");
		for (int i = 1; i <= 10; i++) {
			int num = 9;
			num = num * i;
			System.out.print(num + " ");
		}

		System.out.println(" ");
		// 문제1) 9의 배수 중 일의 자리가 6인 첫번째 배수 출력
		// 답: 36
		System.out.println(">>문제1");
		int i = 0;
		while (i < 1000) {
			if (i % 10 == 6 && i % 9 == 0) {
				System.out.println(i);
				i = 1000;
			}
			i += 1;
		}

		// 문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
		// 답: 63
		System.out.println("\n>>문제2");
		int j = 0;
		while (j < 1000) {
			if (j / 10 == 6 && j % 9 == 0) {
				System.out.println(j);
				j = 1000;
			}
			j += 1;
		}

		// 문제3) 8로 나누면 5가 남는 수 중에 150 가장 가까운 수를 구하시오
		// 답: 149
		System.out.println("\n>>문제3");
		j = 0;
		int ans = 0;
		while (j < 150) {
			if (j % 8 == 5) {
				// System.out.println(j);
				ans = j;
			}
			j += 1;
		}
		System.out.println(ans);

		// # 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
		// # 답 6 (54,63,72,81,90,99)
		System.out.println("\n>>문제4");
		j = 50;
		int cnt = 0;
		while (j <= 100) {
			if (j % 9 == 0) {
				cnt = cnt + 1;
				System.out.print(j + " ");
			}
			j += 1;
		}
		System.out.println("\n9의배수 개수: " + cnt);

		// # 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
		// # 답 980
		System.out.println("\n>>문제5");
		ans = 0;
		for (j = 0; j < 1000; j++) {
			if (j % 28 == 0) {
				if (j / 100 == 9) {
					ans = j;
				}
			}
		}
		System.out.println(ans);

		// # 문제6) 8의 배수를 작은수부터 5개 출력
		// # 답 : 0,8,16,24,32
		System.out.println("\n>>문제6");
		j = 0;
		cnt = 0;
		while (j < 100) {
			if (j % 8 == 0) {
				cnt = cnt + 1;
				if (cnt < 6) {
					System.out.print(j + " ");
				}
			}
			j += 1;
		}

		// # 문제7) 다음의 조건에 맞는수 중에서 200에 가장 가까운 수를 구하시요.
		// # 조건1) 12와 30의 배수입니다.
		// # 조건2) 6으로 나누어 떨어집니다.
		// # 답 : 180
		System.out.println("\n\n>>문제7");
		j = 0;
		ans = 0;
		while (j < 200) {
			if (j % 12 == 0 && j % 30 == 0) {
				if (j % 6 == 0) {
					ans = j;
				}
			}
			j += 1;
		}
		System.out.println(ans);

		// # 문제 8) 높이가 11cm 인 컵속에 달팽이가 있습니다.
		// # 낮에는 4cm 올라가고 밤에는 자다가 2cm 내려갑니다. 증가
		// # 이 달팽이가 컵을 빠저나가는데는 며칠이 걸리겠습니까? 증가
		// # 조건 (반복문 사용)
		System.out.println("\n>>문제8");

		int time = 0;
		int day = 0;
		int move = 0;
		boolean run = true;
		int height = 0;

		while (run) {
			// if (time % 2 == 0) {
			// move = move + 4;
			//
			// } else if (time % 2 == 1) {
			// move = move - 2;
			// }

			if (height <= 11) {
				move = move + 4;
				height = height + move;
				System.out.println(move);
				day += 1;
			} else {
				run = false;
				System.out.println("탈출");
			}

		}
		System.out.println("달팽이가 탈출하는데 걸린 일자: " + day);

	}
}
