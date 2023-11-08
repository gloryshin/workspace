package Chapter2;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//묵시적 형변환
		//바이트 크기가 작은 자료형에서 큰 자료형으로 자동변환
		byte value = 127; //1바이트 자ㅛ형
		int value2 = value+1; //4바이트
		//byte value3 = value2; //큰 자료형에 작은 자료형을 저장하는 것은 불가능
		System.out.println(value2);
		//덜 정밀한 자료형에서 더 정밀한 자료형으로 자동변환 (더 정밀한건 소수점을 뜻합니다.덜정밀 : 인트쇼츠바이트롱
		int iNum = 10;
		float fNum = iNum;
		System.out.println(fNum);
		//iNum = fNum;//ㄷ 정밀한 자료형을 덜 정밀한 자료형에 저장하는 것은 불가능
		double dNum = fNum + value2 + iNum;
		
		double dNum1 =1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		System.out.println(iNum3);
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum4);
		//두개의 변수를 선언하여 10과 2.0을 대입한 후 두개의 값을 더한 결과를 정수로 출력해보세요.
		
		int iNum5 = 10;
		double fNum6 = 2.0;
		int result = (int)(iNum5 +fNum6);
		System.out.println(result);
	}

}
