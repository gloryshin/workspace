package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건 연산자, 삼항 연산자
		//조건식 ? 트루일때 : 폴스
		int i = 10>20 ? 10:20; //조건식이 맞느냐 틀리느냐 에 따라 10이냐 20이냐 가 결정된다.
		//반드시 인트 값을 넣어주셔야 하고 이 값이 스트링값이라면 반드시 10 :20 이부분에는 쌍따 넣어야 함
		System.out.println(i);
		String str = 10<20 ? "참" : "거짓";
		System.out.println(str);
		
//		//연산자의 우선순위 
//		// 1. (),[],.
//		//2. : !, ++2,--2, -2,+2
//		//3.: %,/
//		//4: +,-
//		//5: <,>,>=<=
		//6: &&
//		7: ||
//		8:? (조건연산자)
//		9: =,+=,-=,*=,/= (대입연산자
//		
		
//		int result = 10+1+10*2-10/2+10;
//		System.out.println(result);
		int result = (-10)+(-1)+(10*2)-(10/2)+10>10?0:1;
		System.out.println(result);

	}

}
