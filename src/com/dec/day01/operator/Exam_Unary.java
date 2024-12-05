package com.dec.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		/*
		 * 단항연산자
		 * a++, ++a -> a = a + 1;
		 */
		// 전위연산 : 실행 후 연산
		// 후위연산 : 연산 후 실행
		int num = 1;
		System.out.println(++num); // 전위 연산, num은 2가 됨
		System.out.println(num++); // 후위 연산, +1 연산을 나중에 함, num은 여전히 2가 됨
		System.out.println(num); // 여기서 num은 3이 됨
		// ++num, num++, num -> 2 2 3
		// num++, ++num, num -> 1 3 3
		// num++, num++, num -> 1 2 3
		// ++num, ++num, num -> 2 3 3
		
		/* 
		 * 문제1
		 * a가 10, b는 20, c는 30입니다.
		 * a++;
		 * b = (--a) + b;
		 * c = (a++) + (--b);
		 * 연산을 끝마친 후
		 * a, b, c의 값은 얼마일까요?
		 * -> a: 11, b: 29, c: 39
		 */
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		a++;
//		b = --a + b;
//		c = a++ + --b;
//		System.out.println("a : "+a+", b : "+b+", c : "+c);
		
		/*
		 * 문제2
		 * x는 100, y는 33, z는 0입니다.
		 * x--;
		 * z = x-- + --y;
		 * x = 99 + x++ + x;
		 * y = y-- + y + ++y;
		 * 연산을 끝마친 후 
		 * x, y, z의 값을 얼마일까요?
		 * -> x: 296, y: 95, z: 131 
		 */
		int x = 100;
		int y = 33;
		int z = 0;
		x--; // x=99
		z = x-- + --y; // x=98 
		// 한줄에서 실행할 때에도 단항연산자를 실행하고 다음으로 넘어감
		x = 99 + x++ + x; // x = 99+98+99
		y = y-- + y + ++y; // y = 32 + 31 + 32
		
		System.out.println("x : "+x+", y : "+y+", z : "+z);
		/*
		 * 문제3
		 * a = 5;
		 * b = 10;
		 * c= (++a) + b; c는 16 a는 6
		 * d = c / a; d는 2
		 * e = c % a; e는 4
		 * f = e++; f는 4, e는 5
		 * g = (--b) + (d--); b는 9, d는 1,g는 11
		 * h = 2;
		 * i = a++ + b / (--c/f) * (g-- - d) % (++e + h);
		 * 6+9/(15/4)*(11 - 1)%(6+2)
		 * 6+9/(3)*(10)%(8)
		 * 6+2
		 * a: 7, b: 9, c: 15, d: 1, e: 6; f: 4, g: 10, h: 2, i: 12
		 */
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
//		e값을 f에 집어넣고 1을 더함
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		System.out.printf("%d %d %d %d %d %d %d %d\n",a,b,c,d,e,f,g,h);
		int i = a++ + b / (--c/f) * (g-- - d) % (++e + h);
		System.out.printf("%d %d %d %d %d %d %d %d %d",a,b,c,d,e,f,g,h,i);
	}
	
}
