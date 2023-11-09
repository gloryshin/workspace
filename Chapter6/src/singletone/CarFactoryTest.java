package singletone;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때 마다 
		//고유번호가 부여됩니다. 자동차 번호는 10001부터 시작되어 자동차가 생성될 때마다 10002,10003
		//이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 만들어보세요.
		//CarFactoryTest코드가 수행될 수 있도록 구현해 봅시다.
		
		CarFactory factory = new CarFactory.getInstance();
		Car mySonata = factory.creaCar();
		Car yourSonata = factory.creaCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum);
	}

}
