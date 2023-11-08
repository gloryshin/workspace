package switchTest;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch
//		switch(변수) {
//		case 비교하고싶은 값:
//			실행문;
//			break;
//			
//		default://else와 같은거
//			
//		}
		int ranking = 10;
		char medalColor;
		switch (ranking) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 's';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';


		}
		System.out.println(ranking +"등의 메달 색은" +medalColor +"입니다.");
	}

}
