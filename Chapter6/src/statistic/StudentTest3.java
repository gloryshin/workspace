package statistic;

public class StudentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생마다 각각 다른 학생카드가 발급되며 카드번호는 학생번호에 100을 더한 값입니다.
		// 학생이 생성될때마다 자동으로 학생카드의 값도 설정되도록 만들어보세요.

		Student lee = new Student();
		System.out.println(lee.studentID);

		Student kim = new Student();
		System.out.println(kim.studentID);

		for (int i = 0; i < 100; i++) {
			Student ahn = new Student();
			System.out.println(ahn.studentID);

		}
	}

}
