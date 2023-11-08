package forTest;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue 문 반복문 안에서 컨티뉴를 만나면 나머지 코드를 실행하지 않고 다음 반복을 실행한다.
		//2의 배수를 제외한 반복문 출력 그러면 컨티뉴를 적어주면 된다. 출력하는 반복문 2로 나누었을때 ㄴ누어 떨어지는 배수
		for(int i=1; i <=100; i++) {
			if(i%2 ==0) {
				continue;//continue를 만나면 if로 안가고 증감식으로 넘어가게 된다.
			}
				
			System.out.println(i);
		}
		
		
		//break 문
		//반복문 안에서 break; 를 만나면 반복문을 종료
		int sum = 0;
		int i = 0;
		for(i=1; i<100; i++) {
			if(sum>3000) {
				break;
			}
			sum+=i;
			
		}
		System.out.println(sum + "이 될 때까지를 더한 횟수 = " + i);
		System.out.println(sum);
	}

}
