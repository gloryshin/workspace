package switchTest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5층 건물의 층수를 받아 어떤 층인지 알려주는 프로그램
		// 1층 : 약국 , 2층 : 정형외과, 3층 : 피부과, 4층 : 치과, 5층 : 헬스클럽
		Scanner sc = new Scanner(System.in);
		System.out.print("floor input : ");
		int floor = sc.nextInt();
		String store;
		switch (floor) {
		case 1:
			store = "drugstore";
			break;
		case 2:
			store = "plascic surgery";
			break;
			
		case 3:
			store = "skin clinic";
			break;
			
		case 4:
			store = "dental clinic";
			break;
		case 5:
			store = "gym club";
        default:
        	store = "nothing";
        	
		}
		System.out.println(floor + " is " + store + ".");
		

	}

}
