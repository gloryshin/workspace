package Chapter2;

public class Variable2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 자료형
		byte b =31; //1바이트 :-128 ~ +127 =뒤에 들어가는 값은 리터럴일고 한다 literal
		short s = 245; //2바이트 : -32768 ~ +32767
		int i =34562456; //-2147483648 ~ +2147483647 //int 숫자계산시 사용 integer의 약자
		long l= 8746872346872L;//-922372036854775808 ~ +9223372036854775807
		//cntl+space : 자동완성
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		
		char c = 65; //한글자만 표시하는 자료형 char(charactor의 약자)
		System.out.println(c);
		char k = '가'+1;
		System.out.println(k);//강제형변환
		
		//여러글자를 표시하는 자료형 String(기본 자료형X)클래스 자료형
		String str = "String 자료형은 문자열을 저장합니다."; //
		System.out.println(str);
		//실수
		float f = 0.1f; //에프를 붙여야 에러가 사라진다 4바이트 자료형
		double d = 0.2; //8바이트 자료형
		System.out.println(f);
		System.out.println(d);
		for(int i2=0; i2<10; i2++) {
			d = d + 0.1;
			
		}
		System.out.println(d);
		boolean bo = false; //논리 자료형 불린 : true false 둘중하나만 저장 가능
		System.out.println(bo);
		
		var v1=10;// 배리어블 자료형
		var v2 = 10.2;
		var v3 = 'a';
		var v4 = true;
		var v5 = 1.12f;
		var v6 = 100012345654L;
		var v7 = "String 자료형";
		v3 = ""
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
	}

}
