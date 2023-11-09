package statistic;

public class Student {

	// static : 정적인, 프로그램이 실행될 때 함께 선언
	// 인스턴스를 생성하지 않아도 사용할 수 있는 변수나 메서드
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student() {
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100;
	}

	// static 메서드, 정적 메서드
	// 인스턴트를 생성하지않아도 사용할 수있다

	public static int getSerialNum() {
		return serialNum;

	}

	// 일반메서드를 만들어서 스태틱 메서드를 가져와보도록 하겠습니다.
	// 일반메서드에서는 스태틱 변수를 사용할 수있음
	public void showInfo() {
		System.out.println(serialNum);

	}

	// 스태틱 메서드에서는 일반 멤버 변수를 사용할 수없음
	public static void shownfo2() {
		System.out.println(serialNum);
	}
}
