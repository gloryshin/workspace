package classtest;

public class Person {

	String name; //이름
	int height; //키
	int weight; //몸무게
	char gender; //성별
	boolean married; //결혼여부
	
	public Person( ) {}
//person생성자 작성하기
	//기본생성자
	//person이 가지고 있는 모든 멤버변수의 데이터를 설정하는 생성자
	public Person( String name,int height,int weight,char gender,boolean married) {
		this.name =name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
		
	}
	void showPersonInfo() {
		System.out.println(name+","+ height+","+weight+","+married);
	}// 기능을 만들어봤다. 사람에대한 모든 정보를 출력하는거다. 쇼스투던트 인포를 실행하면 ㅇ언제든지 이런 정보를 꺼내올 수있다.
	int add(int x, int y) {//파라미터 매개변수 애드를 실행할 때필요한값을 가져온다//반환 자료형 //자료형을 쓰던지 void를 쓰던지 void를 쓰면 반환값이 없어도 된다
		int result = x+y;
		return result;
		Person person2 =new Person(Shin,170,47,F,true);
	}
}
//void는 값을 반환하지 않을 때 사용