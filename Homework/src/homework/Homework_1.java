package homework;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("두 정수를 입력하세요 : ");
//	int a1 = sc.nextInt();
//	int a2 = sc.nextInt();
//	System.out.println(a1 + "+" + a2 + "은 " + (a1+a2));
//	
////	Q2
//	System.out.println("몇층인지 입력하세요 : ");
//	int b1 = sc.nextInt();
//	System.out.println(b1*5 + "m 입니다.");
////	Q3
//	System.out.println("x 값?");
//	int x = sc.nextInt();
//	int y = (x*x)-(3*x)+7;
//	System.out.println("x"+x+, ",y="+y);
	
//	Q5
//	System.out.println("논리연산을 입력학세요");
//	boolean a = sc.nextBoolean();
//	String op =sc.next();
//	boolean b = sc.nextBoolean();
//	switch(op) {
//	case "AND" :
//		System.out.println(a&&b);
//	break;
//	case "OR" : 
//		System.out.println(a||b);
//	break;
//	}
////	Q6
//	 System.out.println("돈의 액수를 입력하세요: ");
//	 int money = sc.nextInt();//65245
//	 int m1 = money/50000;
//	 money = money%50000;//15245
//	 int m2 = money/10000;
//	 money = money%10000;//5245
//	 int m3 = money/1000;
//	 money = money%1000;//245
//	 int m4 = meney/500;
//	 money = money%500;//245;
//	 int m5 = money/100;
//	 money = money%100;//45
//	 int m6 = meney/10;
//	 money = money%10;//5
//	 int m7 = meney/1;
//	 money = money%1;//0
//	System.out.println("오만원");
//	
////	Q7
	
//	
//	System.out.print("학점을 입력하세요 : ");
//	String str = sc.next();
//	switch(str) {
//	case "A" : case "B" : 
//		System.out.println("Excellent");
//		break;
//	case "C" : case "D" :
//		System.out.println("Good");
//		break;
//	case "F" :
//		System.out.println("Bye");
//		break;
//		
//	}
//	
//	Q8
	System.out.print("커피 주문하세요 : ");
	System.out.println();
	String coffee = sc.next();
	int count = sc.nextInt();
	int total = 0;
	if(coffee.equals("espresso")) {
		total = 2000*count;
	}else if(coffee.equals("아메리카노")) {
		total = 2500*count;
	}else if(coffee.equals("카푸치노")) {
		total = 3000*count;
	}else if(coffee.equals("카페라떼")) {
		total = 3500*count;
	}
	System.out.println(total + " 원 입니다.");
//	switch
	switch(coffee ) {
	case "dptmvmfpth" :
		total = 2000*count;
		break;
	case "아메리카노" :
		total = 2500*count;
		break;
	case "카푸치노" :
		total = 3000*count;
		break;
	case "카페라떼" :
		total = 3500*count;
		break;
		}
		System.out.println(price+" 원입니다.");
	
	}

}
