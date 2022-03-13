package day0310.t2_API.t4_String;

import java.io.UnsupportedEncodingException;

//getByte()메소드는 문자형식의 자료를 byte[](바이트배열)로 변환시켜준다. - 이때 인코딩/디코딩 시킬 수 있다.
public class T1_getBytes {
	public static void main(String[] args) {
		String str1 = "안녕하세요!";	
		String str2 = "Hello!";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		//1KByte = 2^10Byte = 1024Byte(약 1000Byte = 약 10^3)
		//1MByte = 2^20Byte = 약 10^6Byte(백만)
		//1GByte = 2^30Byte = 약 10^9Byte(십억)
		
//		byte b1;	//전송을 byte 단위로 하게되면 가장 안정적인것은 맞지만 1GByte를 옮기려면 십억번 왔다갔다 해야한다..
		byte[] b1 = str1.getBytes();		//getBytes()는 글자를 바이트 단위로 바꿔준다..
//		byte[] b2 = new byte[1024]; //한번에 1024바이트씩 끌어오겠다.. 일반적인 파일 업로드 방식.. 전송속도가 빨라진다..
//		byte[] b2 = new byte[2048]; //java에선 2Kbyte씩 전송하는 것을 권장한다..
		System.out.println(b1.length); 		//유니코드는 한글 하나당 3byte이다. 3*5+1
		
		
		//인코딩 / 디코딩 예제
		try {
			//EUC-KR로 인코딩/디코딩 예
			byte[] b3 = str1.getBytes("EUC-KR");	//자료를 전송하기 위해 인코딩한다.
			System.out.println("b3 : " + b3);  		//배열의 주소가 찍힌다.
			
			String str3 = new String(b3, "EUC-KR");  //~~~이동후 다시 전송되어온 자료를 받아주기 위해 디코딩 처리 한다. ->다시 문자형식으로 바꾸기.
			System.out.println("디코딩한 결과 : " + str3);
			
			
			//UTF-8로 인코딩/디코딩 예(지금은 무조건 이 방식으로)
			byte[] b4 = str1.getBytes("UTF-8");
			System.out.println("b4 : " + b4);
			String str4 = new String(b4, "UTF-8");
			System.out.println("디코딩한 결과 : " + str4);
			
			
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
			System.out.println("인코딩 에러~~" + e.getMessage());
		}
	}
}
