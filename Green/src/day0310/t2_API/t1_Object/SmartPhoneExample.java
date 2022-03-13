package day0310.t2_API.t1_Object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone_toString myPhone = new SmartPhone_toString("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone); 	//매개값으로 객체를 주면 객체의 toString()메소드를 자동호출
	}
}
