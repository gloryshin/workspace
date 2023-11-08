package homework;

import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
////		Q5
		int sub = 3;
		for (int i = 4; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				if (j < sub) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}

////		Q6
		for (int i = 7; i >= 4; i--) {
			for (int j = 0; j < 1; j++) {
				if (j > sub) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			sub++;
			System.out.println();
		}
//		
//		Q7
		for (int i = 7; i >= 6; i--) {
			for (int j = 0; j < 1; j++) {
				if (j > sub) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			sub++;
			System.out.println();
		}
//		Q8
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요 : ");
			int player = sc.nextInt();
			int computer = (int) (Math.random() * 3) + 1;
			int result = player - computer;
			String a1 = "";
			int win = 0;
			int lose = 0;
			if (result == 0) {
				a1 = "비김";
			} else if (result == -2 || result == 1) {
				a1 = "승리";
			} else {
				a1 = "패배";
			}
			win++;
			System.out.println("플레이어" + rockPaper(player) + "vs" + rockPaper(computer) + "컴퓨터 : " + a1);
			System.out.println("승리 : " + win + "/5, 패배 : " + lose);
			if (win >= 5) {
				System.out.println("종료");
				break;

			}

		}

	}

	public static String rockPaper(int num) {
		String str = "";
		if (num == 1) {
			str = "가위";
		} else if (num == 2) {
			str = "바위";
		} else {
			str = "보";
		}
		return str;
	}

}
