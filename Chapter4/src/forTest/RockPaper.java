package forTest;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		// 가위바위보 게임 만들기
		// 가위 : 1, 바위: 2, 보 : 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one among rock, sissors, paper: ");
		// int player = sc.nextInt();
		int player = sc.nextInt();
		int computer = (int) (Math.random() * 3) + 1;
		if ((player == 1) && (computer == 1) || (player == 2) && (computer == 2) || (player == 3) && (computer == 3)) {
			System.out.println("비겼음");
			System.out.println("가위바위보 다시하자");
	
		} else if ((player == 1) && (computer == 2) || (player == 2) && (computer == 3)
				|| (player == 3) && (computer == 1)) {
			System.out.println("내가 이겼다");


		} else if ((player == 1) && (computer == 3) || (player == 2) && (computer == 1)
				|| (player == 3) && (computer == 2)) {
			System.out.println("내가 졌다ㅠㅠ");

		} else {
			System.out.println("입력오류");
		}
	}
}
