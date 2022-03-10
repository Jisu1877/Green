package day0310.t1_Exception;

public class T3_NumberFormatException {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "seoul100";
		
		System.out.println("data1 + 200 = " + data1 + 200);
		
		int intData1 = Integer.parseInt(data1);
		System.out.println("intData1 = " + intData1);
		
		int intData2 = Integer.parseInt(data2) + 200;
				System.out.println("intData2 = " + intData2);
	}
}
