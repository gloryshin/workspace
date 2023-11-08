package operator;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관계 연산자, 비교연산자
		int num1 = 3;
		int num2 = 3;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		//논리 연산자 &&, ||, ! : 논리연산자
		System.out.println(1>2 && 10==10);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true); //두개의 항 중 하나라도 트루일때 트루를 출력
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		
		
	}

}
