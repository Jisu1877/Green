package day0310.t2_API.t3_Class;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("day0310.t2_API.t3_Class.Sample");
			System.out.println("파일이 존재합니다.");
			
			Class clazz = Sample.class; 		//Class타입으로 변수를 만들어서 Sample의 정보를 불러온다.
			System.out.println("이름 : " + clazz.getName());
//			System.out.println("패키지명 : " + clazz.getPackageName());  //왜 에러??? 모르겠다..
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("Simple명 : " + clazz.getSimpleName());
			
			Class imgPath = Test1.class;
			System.out.println("그림파일의 경로명 : " + imgPath.getResource("./images/1.jpg").getPath());		//상대경로지정..
			System.out.println("그림파일의 경로명 : " + clazz.getResource("./images/1.jpg").getPath());		//Test1과 Sample은 같은 선상에 있기 때문에 변수가 변해도 동일한 결과가 나온다.
			
		} catch (ClassNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
