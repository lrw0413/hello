package com.neusoft.test;

import java.util.Scanner;

public class Test2 {

	// 主方法
	public static void main(String[] args) {
		// 整型id
		int id;
		// 字符串类型 变量名为name
		String name = "张三";
		// The local variable name may not have been initialized
		System.out.println(name);
		
		int age = 28;
		if(age < 28) {
			int score = 100;
			System.out.println(score);
		}
		// score cannot be resolved to a variable
//		System.out.println(score);
		
		// 数据类型
		// 整型
		// The literal 13241234856854 of type int is out of range 
		long num = 13241234856854L;
		
		// 编码集:utf-8
		// 拿空间换时间
		// 几百MB  256GB
		// 500MB  1.5GB
		float num2 = 2.0F;
		
		// char
		char c = 'a';
		char d = '国';
		char sex = '男';
		char sex2 = '女';
		
		// ascII码表值
		// 记住A a 0 的ascII值
		char e = 97;
		System.out.println(e);
		
		// unicode
		char f = 20013;
		System.out.println((int)f);
		
		
		// 产生随机字符
		// 验证码
	    //  bcgh  jklh
		// 随机生成100个0-57的整数
//		for(int i=0;i<100;i++) {
//			// 创建随机数的工具
//			Random random = new Random();
//			int nextInt = random.nextInt(26);
//			char val  = (char)('A'+nextInt);
//			System.out.println(val);
//		}
		
		
//		boolean meeting = true;
//		if(meeting) {
//			System.out.println("开会");
//		}else {
//			System.out.println("下课");
//		}
		
		// 八种基本数据类型
		// byte short int long 
		// float double
		// char boolean
		
		// 接收控制台输入
		// java严格区分大小写
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入您的取款密码");
		// 将接收到的整数存到nextInt变量中
//		int nextInt = scanner.nextInt();
//		System.out.println("您的取款密码:"+nextInt);
		
		
		// 1.
		int age1 = 15;
		int age2 = 18;
		System.out.println(age1+age2);
		
		// 输出2进制 八进制 十六进制数
		int oneNum = 19;
		// 二进制
		System.out.println(Integer.toBinaryString(oneNum));
		// 八进制
		System.out.println(Integer.toOctalString(oneNum));
		// 十六进制
		System.out.println(Integer.toHexString(oneNum));
		
		// 3.
		long one = 12345678901L;
		float two = 3.1415926F;
		double three = 1234567890.0987654321;
		
		// 4.
		
		
		// 5.
		Scanner scanner = new Scanner(System.in);
		System.out.println("请你输入一个整数:");
		int nextInt = scanner.nextInt();
		System.out.println("平方"+(nextInt*nextInt));
		
		// 牛郎织女
		double distance = 9460730472580800.0;
		System.out.println("一共需要"+distance/0.45+"只喜鹊");
		
		
		// 自由落体
		double dis = 2*9.8*384;
		// jdk 开方
		System.out.println(Math.sqrt(dis));
		
		
	}
}