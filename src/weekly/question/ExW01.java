package weekly.question;

import java.util.Scanner;

/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 * 
 * 제한사항: s는 길이 1 이상, 길이 8 이하인 문자열입니다. 리턴은 true, false만 존재
 * 
 */
public class ExW01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * # String 클래스 메소드 1) .length(인수) : 문자열의 길이를 리턴한다. 반환형은 int형이다.
		 * 
		 * 2) .charAt(인수) 인수번째의 문자를 읽어 냅니다. 예) "abcde".charAt(2)에는 'c'가 읽어 집니다. 0부터 시작하기
		 * 때문에 3번째인 'c'가 읽어 집니다.
		 * 
		 * 참고:https://pridiot.tistory.com/34
		 */
		char ch;
		boolean check = true;

		System.out.println("문자열 입력");
		String str = sc.next();

		int size = str.length();

		if (size == 4 || size == 6) {
			for (int i = 0; i < size; i++) {
				ch = str.charAt(i);
				// System.out.println("index " + i + " ch " + ch);

				if ('a' <= ch && ch <= 'z') {
					check = false;
				} else if ('A' <= ch && ch <= 'Z') {
					check = false;
				}

			}
			System.out.println(check);

		} else {
			System.out.println("false");
		}

	}

}
