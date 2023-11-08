package classtest;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체선언//클래스명 변수명 =new 생성자();//생성자는 반드시 클래스 명으로 이루어져있다
		Person Kim = new Person();//kim 은 변수
		
		Kim.name = "김유신";
		Kim.height =180;
		Kim.weight = 80;
		Kim.gender = 'm';
		Kim.married = true;
		//변수명.메서드명() : 메서드 실행방법
		Kim.showPersonInfo();//method
		//변수명.멤버변수명: 멤버 변수 사용방법
		System.out.println(Kim.name);
		System.out.println(Kim.add(10, 20));//반드시 인트는 인트로 스트링은 스트링으로 적어야한다

//메서드는 함수를 뜻함 함수란 원하는 값을 넣었을때 출력하게 되고 x,y를 넣었ㄷ을때 add함수라면 x+y는 더한결과라 나오는거다. 이게 함수의 기본적인 형식이 되는거다. 이게 메서드다 개념을 ㄷ르겠지만 실제로 하는 내용은 가다. 자바코드로 ㅂㄴ환 x,y : 매개변수라고 한다. 인수라고도 한다. 영어로는 parameter라고 한다. 매개변수 파라미터 인수라고 하면 x,y를 만하는거다. x+y는 실행문이라고 생각하면된다. result값는 결과값이라고 하기도 하고 return값이라고 한다. 한국말로 반환값이라고 한다. 리턴은 돌려준다는말 엑스와이 더해서 돌려주기때문에 리턴이라고 한다. 이걸 자바 코드로 변환해보겠다.
		//더하기니까 이름을 add라고 지어줄거다.
		//반환 자료형(한칸띄우고)메서드명(괄호하고)(매개변수)적어주면된다.
		//실행문;
		//return 이라고 적어주고 반환값;을 적어주면된다.
		PersonTest pt = new PersonTest();//new는 pt라는 인스턴스를 생성해주었다
		System.out.println(pt.divide(10, 2));
	}
	int divide(int x, int y) {//클래스 중괄호 안에 만들어야하고 메인안에 만들면안된다
		return x/y;
		
	}
}
