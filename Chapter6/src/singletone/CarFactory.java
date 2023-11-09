package singletone;

public class CarFactory {
	private static Carfactory instance = new CarFactory();

	private CarFactory();

	public CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;

	}
	public Car createCar() {
		Car car = new Car {
			
		}
	}
}
