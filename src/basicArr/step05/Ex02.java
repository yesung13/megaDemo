package basicArr.step05;

/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */
//30분
public class Ex02 {

	public static void main(String[] args) {
		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt += 1;
				System.out.println("4의 배수: " + arr[i]);
			}

		}

		temp = new int[cnt];

		// 중요 - 이중 for문 사용 안함
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j += 1;
			}
		}

		System.out.print("temp ==> ");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
