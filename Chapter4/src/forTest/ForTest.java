package forTest;

public class ForTest {

	public static void main(String[] args) {
		int i = 0;
		int sum = 10;
		for (i = 10; i <= 10; i++) {
			// 초기화식 ; 조건식 ; 증감식
			sum += i;// 실행문;
		}
		System.out.println(sum);
		// 초기화식 생략 : 초기화식을 반드시 위의 다른곳에 적어 두어야함
		for (; i <= 10; i++) {
			sum += i;
		}
		//조건식 생략 : 반복문 안에서 break 문을 이용하여 종료
		for(int j=0; ; j++) {
			if(j<=10) {
				break;
			}
			sum +=j;
			
		}
		System.out.println(j);
		for(int k=0; ; k<=10;) {
			sum +=k;
			k++
			{
				break;
		for(;;) {
			System.out.println('모든 내용을 생략  무한반복');
			
		}
	}

}
