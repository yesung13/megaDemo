package basic.step12;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

//질문
//문제점은 0~150 범위가 나오게 되면 숫자가 보여지지 않아 랜덤으로 주면 처리가 느리다 
//(rNum/10)%10 십의 자리를 구하는 방식으로 가능한가?


public class Ex06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("랜덤 숫자 게임");
		int rNum = ran.nextInt(250)+1;
		
		if(150 <= rNum && rNum <= 250) {
			System.out.print("랜덤숫자의 가운데 숫자 입력\n"+rNum+"\t: ");
			int answerNum = sc.nextInt();
			
			if((rNum/10)%10 == answerNum) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("실패입니다.");
			}
		}else {
			
		}
	}
}
