package step15;

import java.util.Random;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */

public class Ex04 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = ran.nextInt(8) + 2;
		int num2 = ran.nextInt(9) + 1;
		int answer = num1 * num2;
		int cnt = 1;
		while (cnt <= 5) {
			
			cnt++;
		}
		System.out.println(num1 + " * " + num2 + " = ");
		
	}

}
