package classtest;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 생성
	Person kim = new Person();
	kim.name = "김유신";
	Person lee = new Person(lee,170,47,f,true);
	lee.name = "이순신";
	Person ahn = new Person();
	ahn.name = "안연수";
	Person song = new Person();
	song.name = "송치원";
	
	//이번엔 기능을 사용해보죠
	kim.showPersonInfo();
	lee.showPersonInfo();
	ahn.showPersonInfo();
	song.showPersonInfo();
	
	//객체를 여러개 만들었다.
	//person이라는 클래스(설계도)를 만들어주었다. 이걸 이용해서 인스턴스(제품)new  
	//person 이 생성되는 순간 인스턴스를 생성했다고 말하는 거다.
	//클래스 하나로 수없이 많은 인스턴스를 생성할 수 있다.
	//데이터 베이스를 배워보면 표형식으로 데이터 저장 클래스에 데이터내용을 적어놓고 인스턴스를 생성해서 쓸수 있다. 수없이 많이 생성 가능
	//
	//쇼핑몰 주문을 만들거다
	}
}
