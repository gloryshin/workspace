package statistic;

public class StudentTest {
// 지역변수 로컬변수라고도 하고 메서드의 안에서 만들어진 변수로 메서드 밖에서는 사용 할 수 없습니다.
	// 멤버변수 : 클래스 안에서 만들어진 변수로 인스턴스를 생성하여 클래스 밖에서 사용할 수 있습니다.
	// 스태틱 변수 (정적변수) : static으로 선언된 변수로 클래스 이름을 사용하여 어디서든 사용이 가능하고
	// 프로그램이 실행될 때 생성되어 단 하나의 값만을 공유한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student lee = new Student();
		System.out.println(lee.serialNum);
		lee.serialNum++;

		Student kim = new Student();
		System.out.println(kim.serialNum);
		kim.serialNum++;

		System.out.println(Student.serialNum);
		Student.shownfo2();

	}

}
