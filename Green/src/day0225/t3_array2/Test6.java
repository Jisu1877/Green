package day0225.t3_array2;

public class Test6 {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "Java";
		str[1] = "C++";
		str[2] = "C#";
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"] = " + str[i]);
		}
	}
}
