package classtest;
class Order{
	//주문번호, 주문자 아이디 , 주문날짜, 주문자 이름,주문 상품 번호, 배송주소
	//201803120001, abc123, 2018년3월12일, 홍길동, PC0345-12, 
	//서울시 영등포구 여의도동 20
	//기능 : 모든 내용을 출력하는 기능 (showOrderInfo)
	long orderNumber;
	String userID;
	String orderDate;
	String orderName;
	String goodsID;
	String orderAddress;
	public Order( ) {}// 기본생성자 : 작성하지 않더라도 실행가능(프로그램이 생성될 때 컴퓨터가 생성해줌)
	
	//여러개의 생성자 작성 방법
	//여러개의 생성자 작성ㅂㅇ법(생성자(=메서드) 오버로드)
	//생성자의 매개변수의 갯수를 다르게 한댜ㅏ.
	//생성자의 매개변수 자료형을 다르게 한다.(같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	public Order(long orderNumber,	String userID,	String orderDate,String orderName,
	String goodsID,	String orderAddress) {
		this.orderNumber = orderNumber;
		this.userID = userID;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.goodsID = goodsID;
		this.orderAddress = orderAddress;}
	
	public Order(long orderNumber) {
					this.orderNumber = orderNumber;
		
		
		//디스는 자기 자신을 듯ㅎㄴ다
	}
	
	void showOrderInfo( ) {
		System.out.println("주문번호 :" +orderNumber);
		System.out.println("주문자 아이디 :"+userID);
		System.out.println("주문 날짜 :"+orderDate);
		System.out.println("주문자 이름 :"+orderName);
		System.out.println("주문 상품 번호 :"+goodsID);
		System.out.println("배송 주소 :"+orderAddress);
	}
	//여러개의 생성자 작성 방법
		//여러개의 생성자 작성ㅂㅇ법(생성자(=메서드) 오버로드)***오버로드 중요함 같은 이름의 메서드를 만들수있도록 
	//하는 도구
		//생성자의 매개변수의 갯수를 다르게 한댜ㅏ.
	int add(int x) {
		return x+x;
	}
	long add(long x, int y){
		return x+y;
	}
	
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order();
		order1.orderNumber = 201803120001L;
		order1.userID = "abc123";
		order1.orderDate = "2018년3월12일";
		order1.orderName =" 홍길동";
		order1.goodsID = "PC0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20";
		//컨트롤 플러스 메서드 이름클릭 : 메서드가 선언되어있는 코드로 이동
		order1.showOrderInfo();
		
		Order order2 = new Order(201803120002L, "def123", "2023년11월3일", "이순신", "PD7890-54", "부산시 부산진구");
		order2.showOrderInfo();
			
		

	}

}
