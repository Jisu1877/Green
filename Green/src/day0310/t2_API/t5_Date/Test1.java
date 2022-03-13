package day0310.t2_API.t5_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		//Date() : 날짜 생성객체
		Date now = new Date();
		System.out.println("오늘 날짜: 날짜형식(기본형식)?" + now);
		
//		String strnow = now.toString();				//Date타입일땐 toString이 가능하다.
//		System.out.println("오늘 날짜 : 문자형식(기본형식)?" + strnow);
//		System.out.println();
		
		//simpleDateFormats() : 매개변수를 지정한 형식으로 변환후 format메소드를 이용하여 문자열로 돌려준다. 
		//년도:y, 월:M, 일:d, 시간:h, 분:m, 초:s
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-M-d h:m:s");
		String strNow = sdf.format(now);
		System.out.println("오늘 날짜는 : " + strNow);
	}
}
