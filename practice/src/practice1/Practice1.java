package practice1;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요.(continue사용)
		// 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.(break 사용)
		// 3. 반복문을 사용하여 다음 모양을 출력하느 프로그램을 만들어 보세요.
		// 4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.

		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1) {
				continue;

			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i * j);
			}

		}

	}

}
