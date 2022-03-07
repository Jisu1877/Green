package day0303.t11_etc;

import java.util.Date;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		//String 객체의 format메소드 사용하기
		//String.format("형식", 변수명)
		//%d(10진수), %s(문자열), %f(실수), %t(날짜/시간), %c(유니코드), %o(8진수), %x(16진수)
		
		int su = 12345;
		System.out.println("1 : " + String.format("%d", su));
		System.out.println("2 : " + String.format("%8d", su));			//8은 전체자릿수.
		System.out.println("3 : " + String.format("%-8d", su));
		System.out.println("4 : " + String.format("%08d", su));			//빈자리를 0으로 채운다.
		System.out.println("5 : " + String.format("%8d_", su));	
		
		//쉼표(,)처리하기 : %뒤에 ','를 붙여서 입력한다.//숫자 3자리가 넘어가면 ,가 찍힌다.
		System.out.println("6 : " + String.format("%,d", su));			
		System.out.println("7 : " + String.format("%,d", 123));			// 3자리가 안넘어가면 안찍힌다.
		System.out.println("8 : " + String.format("%,8d", su));	
		
		//%s
		String str = "Seoul";
		System.out.println("9 : " + String.format("%s", str));	
		System.out.println("10 : " + String.format("%8s", str));	
		System.out.println("11 : " + String.format("%3s", str));	//문자열 크기보다 숫자를 작게 써도 그냥 나온다.
		System.out.println("12 : " + String.format("%.3s", str));	//.을 쓰면 앞에서 3글자만 나온다.
		
		//%f
		double dbl = 123.456789;
		System.out.println("13 : " + String.format("%f", dbl));
		System.out.println("14 : " + String.format("%5f", dbl));
		System.out.println("15 : " + String.format("%.2f", dbl));		//정수는 그대로 나오고 실수자리만 2자리까지 찍힌다.
		System.out.println("16 : " + String.format("%01.2f", dbl));
		
		
		//Locale설정하기
		int money = 123000;
		System.out.println("17 : " + String.format("W %,d", money));
		System.out.println("18 : " + String.format("Y %,d", money));
		System.out.println("19 : " + String.format(Locale.ENGLISH, "$ %,d", money));
		System.out.println("20 : " + String.format(Locale.GERMANY, "$ d C", money));
		System.out.println("20 : " + String.format(Locale.GERMANY, "$ d C", money));
		
		//%t 날짜/시간 : y(년), m/h?(월), d(일), H(24시간제), M(분), S(초), l(12시간제)
		//날짜객체 : Date() - 인스턴스 객체 / Calendar() - 정적 객체
		
		Date today = new Date(); //인스턴스라 객체를 생성해야한다.
		System.out.println("Date() : " + today);
		System.out.println("21 : " + String.format("%%tF(yyyy-MM-dd) : %tF", today));
		System.out.println("22 : " + String.format("%tF", today));
		System.out.println("23 : " + String.format("%tT", today));
		System.out.println("24 : " + String.format("%tm", today) + "월");
		System.out.println("25 : " + String.format("%td", today) + "일");
		System.out.println("26 : " + String.format("%tH", today)+ "시(24시간제?)");
		System.out.println("27 : " + String.format("%tl", today)+ "시(12시간제)");
		System.out.println("28 : " + String.format("%tM", today)+ "분");
		System.out.println("29 : " + String.format("%tS", today)+ "초");
		
		//%c : 유니코드(영문과 숫자는 ASCII코드와 코드값이 같다.)
		System.out.println("30 : " + String.format("%c", 65));
		System.out.println("31 : " + String.format("%c", 97));		//32만큼 크다. 소문자...
		System.out.println("32 : " + String.format("%c", 44032));
		System.out.println("33 : " + String.format("%c", 44033));
		
		//%o : 8진수, %x : 16진수
		int su1 = 10;
		int su2 = 100;
		System.out.println("34 : " + String.format("%o", su1));
		System.out.println("35 : " + String.format("%o", su2));
		System.out.println("36 : " + String.format("%x", su1));
		System.out.println("37 : " + String.format("%x", su2));
		System.out.println("38 : " + String.format("%o, %o", su1, su2));
		System.out.println("39 : " + String.format("%x, %x", su1, su2));
		System.out.println(String.format("40 : %x, %x", su1, su2));
		
	}
}
