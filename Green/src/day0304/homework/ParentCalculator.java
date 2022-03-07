package day0304.homework;
/*
1-1.부모객체(ParentCalculator)는 사칙연산을 하는 계산기 객체이다.
자식객체(ChileCalculator)는 다양한 수학연산자를 사용하는 메소드를 포함하려고 한다.
(반올림(Math.round(3.14)), 제곱근(Math.sqrt(25)), 지수Math.pow(5,2))
앞의 객체를 실행할 클래스로 수를 입력받아 다양하게 출력하는 프로그램을 만들어보자.
1-2. 자식객체는, 부모객체의 뺄셈처리에 있어서 음수값이 발생시는 '감소', 증가값이 발생시는 '증가'로
 처리하고, 또 나눗셈은 소수이하 2자리만 출력시키고자 하는 메소드를 만들고자한다.*/
public class ParentCalculator {
	private double res;
	
	public ParentCalculator() {
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public double add(double su1, double su2) {
		res = su1 + su2;
		return res;
	}

	public double sub(double su1, double su2) {
		res = su1 - su2;
		return res;
	}

	public double mul(double su1, double su2) {
		res = su1 * su2;
		return res;
	}

	public double div(double su3, double su4) {
		res =  su3 / su4;
		return res;
	}
}
