package whileTest;

public class WhileTest1 {
	public static void main(String[]args) {
		
//		while(조건식) {
//			실행문;
//			증감식;
		int i = 0;
		int sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		sum = 0;
		while(i<=10) {
			sum+=i;
			i++;
			
			
		}
		System.out.println(sum);
	}

}
