package com.neusoft.test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//while循环
//		Scanner scanner = new Scanner(System.in);
//		while(1==1) {
//			System.out.println("请输入一个整数:");
//			int nextInt = scanner.nextInt();
//			System.out.println("您输入的数字为:"+nextInt);
//			if(nextInt == -1) {
//				break;
//			}
//		}
		
		// 求 0-3之间的和
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += i;
			System.out.println(sum);
		}
		
		
		
		
		
		
		// do...while  while
		
		// 至少执行一次
		int age = 1;
		do {
			System.out.println("hello");
		}while(age>1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}