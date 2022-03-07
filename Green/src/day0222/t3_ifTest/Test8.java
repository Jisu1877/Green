package day0222.t3_ifTest;

import java.util.Scanner;

// 성명, 국어, 영어, 수학 점수를 입력받아서, 총점, 평균, 학점을 계산하시오.
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 Scanner는 참조타입. 타입을 모르겠을땐 자기자신(클래스명-> 여기선 Scanner)을 타입으로 적는다.
		 new를 사용해 객체를 생성한다.
		 sc라고 변수를 설정해주는 것은 Scanner는 컴퓨터에 메모리를 생성하는데 생성해놓고 사용하지 않으면 안되니까, 사용하기 위해서 변수를 설정한다.
		 */
		System.out.print("성명을 입력하세요? ");
		String name = sc.next();				//next()와 nextLine()과의 차이?
		System.out.print("국어점수를 입력하세요? ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요? ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요? ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
//		double avg = tot / 3.0;	// tot/3 은 int 타입이다. 캐스팅이 필요하다. 강제변환. 3.0이라고 적어도 되고 아래와같이 해도 된다.
		double avg = (double) tot / 3;
		
		String grade = " "; 	//= " " 이렇게 공백으로라도 초기화를 시켜주지 않으면 에러가 난다.
		if(avg >= 90) {
			grade = "A";
//			String grade = "A"; 	//if절 안에 변수가 선언되서 밖에선 사용할 수 없다. 블럭 밖으로 벗어나면 변수가 소멸된다.
		}
		else if(avg >= 80) {
			grade = "B";
		}
		else if(avg >= 70) {
			grade = "C";
		}
		else if(avg >= 60) {
			grade = "D";
		}
//		else if(avg < 60) {		// 이렇게 굳이 적지 않아도 아래와 같이 작성하면 됨.
		else {
			grade = "F";
		}
//		else {
//			grade = "Error"; 
		
		System.out.println("========================");
		System.out.println("성명은? " + name);
		System.out.println("국어점수는? " + kor);
		System.out.println("영어점수는? " + eng);
		System.out.println("수학점수는? " + mat);
		System.out.println("총점은? " + tot);
		System.out.printf("평균은? %.2f\n", avg);	//0자리확보후 소수점 2자리까지 출력. %f는 실수.
		System.out.println("학점은? " + grade);
		
		sc.close();
	}
}
