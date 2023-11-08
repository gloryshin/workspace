package Chapter2;

public class Variable1 {
	public static void main(String [] args) {
		//자료형 변수명; 선언
		int level = 10;
		//변수명 = 숫자; 초기화
		int level2 = 10;
		System.out.println(level);
		int level3 = 100;
		System.out.println(level);
		int level4 = 1000;
		System.out.println(level);
		//변수명 작성 규칙
		//1. 변수이름은 영문자나 숫자를 사용할 수 있고 특수문자 중에서 $,_만 사용할 수 있음.
		//2. 변수명은 숫자로 시작할 수 없습니다.
		//3. 자바에서 이ㅣ 사용중인 예약어는 사용할 수 없음.
		// 표기법
		//카멜 표기법 (변수, 메서드: 단어의 첫단어의 첫글자는 소문자로 나머지 단어의 첫글자는 대문자로 작성 studentNumber
		//파스칼 표기법(클래스명작성시) : 첫단어부터 다른 단어의 모든 첫글자는 대문자로 작성 StudentNumber
		//언더스코어 표기법(상수(모두대문자단어사이에언더바),데이터 베이스의 필드명 작성시) : 단어의 사이에 언더바를 넣어서 작성 student_number
		int level5 = 0;
		level5 = 10;
		System.out.println(level5);
	}
}
