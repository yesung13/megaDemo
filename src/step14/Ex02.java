package step14;

//서식문자(%) 출력문
public class Ex02 {

	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();

		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);

		System.out.printf("%c\n", 'b');

		System.out.printf("%s\n", "문자열");

		String fruit = "apple";
		int cnt = 5;

		System.out.printf("%s가 %d개 있습니다.\n", fruit, cnt);
	}

}
