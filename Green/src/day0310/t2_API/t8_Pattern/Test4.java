package day0310.t2_API.t8_Pattern;

import java.util.Scanner;

//파일명을 입력받아 그림파일(jpg/gif/png)만 업로드할 수 있도록 처리하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("업로드할 그림 파일명(jpg/gif/png)을 입력하세요? ");
		String img = scanner.next();
		//	   01234567890		01234567890
		// ex) atom.jpg			mbc.kbs.gif
		String[] extArr = img.split("\\.");		// .을 제어코드로 읽을까봐 \. 으로 문자 . 이라고 말해주는건데 또 \를 제어코드로 볼 수 있어서 \\. 이라고 적은 것.
		
		String ext = extArr[extArr.length-1].toLowerCase();
		
		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png")) {
			System.out.println("파일 업로드가 가능한 그림파일입니다.");
			System.out.println(ext);
		}
		else {
			System.out.println("그림파일만 업로드 가능합니다.");
			System.out.println(ext);
		}
		
		scanner.close();
	}
}
