package step10;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 30%의 당첨확률
 */

//재도전
public class Ex03 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rNum = ran.nextInt(10);
		
		if(rNum < 3) {
			System.out.println("당첨!");
		}
		
		if(rNum >= 3) {
			System.out.println("꽝!");
		}
		
		
		
	}

}
