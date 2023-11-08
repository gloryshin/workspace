package iftest;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 탭키로 들여쓰기 중괄호 안에는 반드시 한칸 들여쓰기를 할 것
// 컨트롤 쉬프트 에프 cntl shift f : 제자리 찾아가기
		int i = 18;
		int j = 15;
		if (i < j) {
			System.out.println("i는 10보다 큽니다");
			i++;
			i = 10 + 20;
			String str = "소영이는 예쁘다";
					System.out.println(str);
		}
//		if(조건식 : 결과물이 트루 폴스가 출력되는 내용) {
//			실행문 수행문;
//			
//		}
		
		
		else if(i<j){
			String str = "소영이는 몬났";
			System.out.println(str);
		}
		else{
			String str = "소영이는 똑똑하다";
			System.out.println(str);
		}
		
		
	}

}
