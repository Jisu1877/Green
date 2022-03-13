package day0310.t2_API.t4_String;

public class T9_valueOf {
	 public static void main(String[] args) {
		//valueOf() : 각종 자료형을 문자열로 변환... : String.valueOf()
		 int intsu = 1234;
		 System.out.println("intsu : " + intsu);
		 System.out.println("");
		 
//		 String strsu= intsu;	//  불가.
//		 String strsu= (String) intsu; //불가.
//		 String strsu= intsu.toSring(); //불가.  //왜 불가한가?
		 String strsu1 = String.valueOf(intsu); 
		 String strsu2 = String.valueOf(123);
		 String strsu3 = String.valueOf(123.4);
		 String strsu4 = String.valueOf(true);
		 
		 System.out.println("strsu1 : " + strsu1);
		 System.out.println("strsu2 : " + strsu2);
		 System.out.println("strsu3 : " + strsu3);
		 System.out.println("strsu3 : " + strsu4);
		 System.out.println();
		 
		 int a1 = 100, a2 = 200;
		 int res = a1 + a2;
		 System.out.println("res : " + res);
		 String strRes = String.valueOf(a1 + a2);
		 System.out.println("strRes : " + strRes);
		 
	}
}
