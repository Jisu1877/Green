package day0310.t2_API.T6_Calendar;

import java.util.Calendar;

public class Test1 {
	public static void main(String[] args) {
		//Calendar객체 : 날짜 형식을 지정해 놓은 객체...(get()메소드로 꺼내온다.)

		Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);	//현재 월보다 항상 하나 전월로 나온다. 월이 0월부터 들어가있다.
		int day = now.get(Calendar.DATE);
		
		System.out.println("오늘은 "+year+"년 "+(month+1)+"월 "+day+"일 입니다.");
		
		// 일 : 1 / 월 : 2 / .... / 토 : 7 //요일이 숫자로 반환된다.
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("week : " + week);
		
		String strWeek = "";
		switch(week) {
			case 1 :
				strWeek = "일";
				break;
			case 2 :
				strWeek = "월";
				break;
			case 3 :
				strWeek = "화";
				break;
			case 4 :
				strWeek = "수";
				break;
			case 5 :
				strWeek = "목";
				break;
			case 6 :
				strWeek = "금";
				break;
			case 7 :
				strWeek = "토";
				break;
		}
		System.out.println("오늘은 "+strWeek+"요일 입니다.");
	}
}
