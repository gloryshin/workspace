package practice;

public class Customer {

	public String name;
	public int money;//소지금
	
	public Customer(String name, int money) {
		this.name = name;
		this.money =money;
		
	}
	
	public void takeStarCafe(StarCafe cafe) {
		cafe.takeCoffe(price);
		money-= price;
		
	}public void takeBeanCafe(StarCafe cafe) {
		cafe.takeCoffe(price);
		money-= price;
}
	public void showInfo();
	System.out.println(name +"님의 남은돈은"+money+"입니다.")
}
