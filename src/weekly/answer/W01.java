package weekly.answer;

/*
 * 문자열 s의 길이가 4 혹은 6이고,
 * 숫자로만 구성되어 있는지 확인하는 함수, solution 완성
 * 예) s가 "a234"이면 false를 리턴, "1234"이면 true 리턴
 * 
 * s는 길이 1이상  8이하인 문자열
 */
public class W01 {

	public boolean solution(String s) {
		boolean answer;
		if (s.length() == 4 || s.length() == 6) {
			// 정규 표현식 사용
			// ^ -> 시작
			// [0-9] -> 숫자로만
			// *$ -> 0개이상 글자로만 끝남
			answer = s.matches("^[0-9]*$");
			System.out.println(answer);
			return answer;
		}
		answer = false;
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		W01 w01 = new W01();
		w01.solution("a234");
		w01.solution("1234");
		w01.solution("a1a1");
		w01.solution("1aa4");
		w01.solution("123a");
		w01.solution("123456789");
		w01.solution("a123456");
		w01.solution("abc");
	}

}
