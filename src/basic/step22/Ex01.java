package basic.step22;

import java.util.Random;
import java.util.Scanner;

/*
 * ==== 가위 바위 보 (하나빼기) ====
 * 
 * 1) 가위바위보 2개씩 저장 
 * meleft 에 가위바위보 입력 
 * meright 에 가위바위보 입력
 * 
 * comleft 에 가위바위보 입력 (랜덤) 
 * comright 에 가위바위보 입력 (랜덤)
 * 
 * 2) 둘중 하나만 저장
 * me 에 meleft 또는 meright 저장(집접)
 * com 에 comleft 또는 comright 저장(랜덤)
 * 
 * 3) 최종판정
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("==가위, 바위, 보 (하나 빼기)==");

		int me = 0;
		int com = 0;
		int cnt = ran.nextInt(2);

		int i = 0;
		while (i < 3) {
			System.out.println("[me] 가위(0), 바위(1), 보(2)");
			int meleft = sc.nextInt();
			int meright = sc.nextInt();

			System.out.println("왼쪽 오른쪽 선택(0, 1)");
			int sel = sc.nextInt();
			if (sel == 0) {
				me = meleft;
			} else if (sel == 1) {
				me = meright;
			}

			System.out.println("[com] 가위(0), 바위(1), 보(2)\n");
			int comleft = ran.nextInt(3);
			int comright = ran.nextInt(3);

			if (cnt == 0) {
				com = comleft;
			} else if (cnt == 1) {
				com = comright;
			}

			System.out.println("=== 게임 시작 ===");
			System.out.println(
					"meleft: " + meleft + " meright: " + meright + "\ncomleft: " + comleft + " comright: " + comright);
			System.out.println(me + " " + com);

			System.out.println("=== 결과 ===");
			if (com == me) {
				System.out.println("비겼다");
			}

			if (com == 0) {
				if (me == 1) {
					System.out.println("이겼다");
				} else if (me == 2) {
					System.out.println("졌다");
				}
			} else if (com == 1) {
				if (me == 0) {
					System.out.println("졌다");
				} else if (me == 2) {
					System.out.println("이겼다");
				}
			} else if (com == 2) {
				if (me == 0) {
					System.out.println("이겼다");
				} else if (me == 1) {
					System.out.println("졌다");
				}
			}

			i++;

		}
	}
}
