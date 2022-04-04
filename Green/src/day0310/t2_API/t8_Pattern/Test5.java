package day0310.t2_API.t8_Pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

//파일명을 입력받아 그림파일(jpg/gif/png)만 업로드할 수 있도록 처리하시오.
public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("업로드할 그림 파일명(jpg/gif/png)을 입력하세요? ");
		String img = scanner.next().toLowerCase();
		//	   01234567890		01234567890
		// ex) atom.jpg			mbc.kbs.gif
		
		if(Pattern.matches(".*.jpg", img) || Pattern.matches(".*.gif", img) || Pattern.matches(".*.png", img)) {
			//.*.jpg 에서 .*은 앞에 무엇이 오든 뒤에 .jpg 포함여부를 확인하는 것. .**. 에서 뒤에 오는 *. 은 뒤에 무엇이 오던간에.. 라는 뜻이다.
			System.out.println("파일 업로드가 가능한 그림파일입니다.");
		}
		else {
			System.out.println("그림파일만 업로드 가능합니다.");
		}
		
		scanner.close();
	}
}
