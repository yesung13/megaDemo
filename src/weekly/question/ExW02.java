package weekly.question;

import java.util.Scanner;

/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 
 * --제한사항--
 * s는 길이가 1이상, 100이하인 스트링입니다.
 * 
 * 입출력 예)
 * 	 s 		| 	return
 * "abcde"  |	"c"
 * "qwer"	|	"we"
 */


// 풀이 시간 : 4h
public class ExW02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * # String 클래스 메소드 
		 * 1) .subString() : 문자열을 자른다. 반환형은 String형이다.
		 * 	예) 
		 * 	String str = new String("abcdefg"); 
		 * 	// a b c d e f g 
		 * 	// 0 1 2 3 4 5 6 <--index 0부터 시작
		 * 
		 * 	System.out.println(str.substring(2, 6)); // 결과: "cdef" 출력
		 * 	System.out.println(str.substring(5)); // 결과: "fg" 출력
		 * 
		 * 	참고:https://yeolco.tistory.com/30
		 * 
		 * 2) .split() : 배열을 사용하여 특정 문자열을 구분자를 기준으로 잘라 배열에 담아두는 것
		 * 	참고:https://coding-factory.tistory.com/126
		 */

		System.out.print("문자열 입력: ");
		String str = sc.next();

		int cnt = 0;

		String[] c = str.split("");
		int size = c.length;

		if (1 <= size && size <= 100) {

			// 가운데 문자를 출력하기 위해 사용
			for (int i = 0; i < size; i++) {
				cnt = cnt + 1;
			}
			
			// 홀수일 경우 출력할 index 숫자가 규칙적으로 증가하여  cnt를 사용
			// 짝수일 경우 홀수일 경우와 동일하게 cnt를 사용하여 subString으로 범위를 정함
			cnt = (cnt / 2) + 1;
			int result = size - cnt;

			System.out.println("문자열  길이 = " + "c[" + size + "]\n");
			System.out.println("===index 값===");
			if (size % 2 == 1) {// 홀수일 경우
				
				// index 값을 보기 위함
				for (int j = 0; j < size; j++) {
					System.out.println("c[" + j + "] = " + c[j]);
				}
				
				System.out.print("\n[홀수] 가운데 문자 출력: ");
				System.out.println(str.charAt(result));

			} else if (size % 2 == 0) {// 짝수일 경우
				
				// index 값을 보기 위함
				for (int j = 0; j < size; j++) {
					System.out.println("c[" + j + "] = " + c[j]);
				}

				System.out.print("\n[짝수] 가운데 문자 출력: ");
				System.out.println(str.substring(result, (result + 2)));
			}

		}

	}

}
