package com.neusoft.test;

public class Test3 {

	/**
	 * 任务:实现一次函数的计算 y=f(x)=3x+6 
	 */

	/**
	 * int age
	 * String name
	 * char sex
	 * 
	 * 修饰符 返回值类型 方法名(参数列表){
	 * 	  方法体
	 * }
	 */
	//This method must return a result of type int
	public static int f(int num) {
		return 3*num+6;
	}
	
	 public static void outputchar(int x) {
		System.out.println((char)x);
	 }
	
	 public static int i(char x) {
	    return (int)x;
	 }
	
	// 入口
	public static void main(String[] args) {
//		int a = 1;
//		int b = 1;
//		b = a++;
//		System.out.println("a"+a+",b"+b);
		
//		int c = 1;
//      c = c++;  
//      System.out.print(c);
        
		//课上练习：
//		int a = 1;
		     
		     
//		a = ++a;
//		a = a++;
//		     a=2
//		    a++ 2 a=3   ++a 4 a=4	 
//		a = a++ + ++a;
//		                   a=5    6     7
//		                    6     6     6   7
//		System.out.println(a-- + ++a + a++ +a); 25
//		System.out.println(a); 7
		                   
//		2.请分别计算出x,y的值?
//		　int x = 3;
//		           x=4   5
//		           3     5     50
//		　int y = x++ + ++x + x * 10;
//		  System.out.print(x); 58
//		  System.out.print(y); 5
		int x = 3;
		int y = x++ + ++x + x * 10;
		System.out.print("x"+x);
		System.out.print(y);
	}
}