package day0222.t1;

// 전위연산자 : ++i, --i
// 후위연산자 : i++, i--
public class Test8 {
	public static void main(String[] args) {
		// i++ 와 ++i는 i=i+1 과 같고, 또 i+=1과도 같다.
		
		int a = 100;
		int b = 200;
		
		System.out.println("1.a : " + a); //100
		System.out.println("1.b : " + b); //200
		
		a = a + 1;
		System.out.println("2.a : " + a); //101
		b = b - 1;
		System.out.println("2.b : " + b); //199
		
		a++;
		System.out.println("3.a : " + a); //102
		
		++a;
		System.out.println("4.a : " + a); //103
		
		int c = 10, d=10, res;
		res = c + d;
		System.out.println("1.c : " + c); // c: 10
		System.out.println("1.d : " + d); // d: 10
		System.out.println("1.res : " + res); // res: 20
		
		res = ++c + ++d;							// 전위연산자 : 이기적이라 자기먼저 증가함. 먼저 11이 되고 더해서 왼쪽으로 넘겨줌.
		System.out.println("2.c : " + c); // c: 11
		System.out.println("2.d : " + d); // d: 11
		System.out.println("2.res : " + res); // res: 22
		System.out.println();
		
		res = c++ + d++;							// 후위연산자 : 양보심이 강해서 가지고 있던 11 + 11 을 먼저연산해서 넘겨주고 자기자신 증감을 진행함.
		System.out.println("3.c : " + c); // c: 12
		System.out.println("3.d : " + d); // d: 12
		System.out.println("3.res : " + res); // res: 22
		
		res = c++ + ++d;							
		System.out.println("4.c : " + c); // c: 13
		System.out.println("4.d : " + d); // d: 13
		System.out.println("4.res : " + res); // res: 25
		
		res = --c + d++;	// 12 + 13	
		System.out.println("5.c : " + c); // c: 12
		System.out.println("5.d : " + d); // d: 14
		System.out.println("5.res : " + res); // res: 25
	}
}
