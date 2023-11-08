package mydate;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name =  "소영";
int hour = 15;

System.out.println(name + "님 " +hour +"에 배송됩니다");
double score = 90.5;
char grade = 'A';
name = "권라임";
System.out.println(name + "님의 평균점수는 " + score +" 점입니다");
System.out.println("학점은 "+ grade +"입니다");
boolean pass = true;
System.out.println("소영이는 코딩을 해낼 수있을까요??"+pass);
double d = 3.14;
float f = 3.14f;
System.out.println(d);
System.out.println(f);
long l = 1000000000000l;
l = 1_000_000_000_000L;
System.out.println(l);
//int> long>float > double (자동 형변환)
//반대는 수동형변환
//정수 실수 실수 정수 
//문자열은 93이라는 데이터를 s1에 넣고 싶다 
String s1 = String.valueOf(93);//수동 형변환
s1 = Integer.toString(93);
System.out.println(s1);
//Q1 퀴즈1 버스 도착 정보를 출력하는 프로그램을 작성하시오. 각 정보는 적절한 자료형 변수에 정의 합니다.
//정보 : 버스번호는 1234, 상암08 과 같은 형태 남은 시간은 분단위 에 3분 5분
//남은 거리는 km3단위 (예 : 1.5km, 0.8km)
// 버스번호 남은시간 남은 거리 변수정해야될것같음

String bus = "82";
int time = 3;
float km = 1.5f;
System.out.println(time +"분후 " + bus+ "번 버스가 도착합니다. "+ "남은 거리는 " + km + "km 입니다.");

//증감연산++,--
int val;
val = 10;
System.out.println(val);
//System.out.println(++val);
//System.out.println(val);
System.out.println(val++);
System.out.println(val);


















}

}
