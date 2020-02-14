package com.neusoft.test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

	
	public static int getLastNumber() {
		//验证码条码共 13 位，代表了一件商品编码，前 12 位（692116851128）有具体代表含义，第 13 位是通过如下步骤算出来的：
		 //第 1 步：取出该数的奇数位和，c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20
		 //第 2 步：取出该数的偶数位和，c2 = 9 + 1 + 6 + 5 + 1 + 8 = 30
		 //第 3 步：将"奇数和"和"偶数和的三倍"相加，cc = c1+c2*3 = 20 + 30 * 3 = 110
		 //第 4 步：取结果的个位数（对 10 取余）：110 的个位数为（110%10=0）
		 //第 5 步：用 10 减去这个个位数：10 - 0 = 10
		 //第 6 步：对得到的数再取个位数（对 10 取余）：10%10=0
		 //所以校验码为 0
        String str = "692116851128";
        int jiShu = 0;
        int ouShu = 0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				// 取奇数位
				jiShu += Integer.parseInt(str.charAt(i)+"");
			}else {
				// 偶数位
				ouShu += Integer.parseInt(str.charAt(i)+"");
			}
		}
		 //第 3 步：将"奇数和"和"偶数和的三倍"相加，cc = c1+c2*3 = 20 + 30 * 3 = 110
		int result3 = jiShu+ouShu*3;
		//第 4 步：取结果的个位数（对 10 取余）：110 的个位数为（110%10=0）
		int result4 = result3%10;
		//第 5 步：用 10 减去这个个位数：10 - 0 = 10
		int result5 = 10 - result4;
		 //第 6 步：对得到的数再取个位数（对 10 取余）：10%10=0
		int result6 = result5 % 10;
		return result6;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(getLastNumber());
		// java.util.Scanner
//        Scanner sc = new Scanner(System.in);
//        // 随机数
//        Random random = new Random();
//        // java.lang.*
//        System.out.println("输入成绩: ");
//        int n = sc.nextInt();
//        if (n < 60) {
//            System.out.println("不及格");
//        } else if (60 <= n && n <= 79) {
//            System.out.println("一般");
//        } else if (80 <= n && n <= 89) {
//            System.out.println("良好");
//        } else if (90 <= n && n < 100) {
//            System.out.println("优秀");
//        } else if (n == 100) {
//            System.out.println("满分");
//        }
        
//        Scanner nums = new Scanner(System.in);
//        while(true) {
//        	System.out.println("请输入一个数:");
//        	int nextInt = nums.nextInt();
//        	if(-1 == nextInt){
//        		break;
//        	}
//        }
        
        //计算两点之间距离
//        int x1,x2,y1,y2;
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入p1的x值");
//		x1=in.nextInt();
//		System.out.println("请输入p1的y值");
//		y1=in.nextInt();
//		System.out.println("请输入p2的x值");
//		x2=in.nextInt();
//		System.out.println("请输入p2的y值");
//		y2=in.nextInt();
//		double dis;
//		dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//		System.out.println("两点的距离为："+dis);
        
        // 运算符优先级
		//int i = 1;
		//boolean b = 3+4>4||5!=6 &&7>8+ ++i
//		               7               10
//		  boolean b = 3+4>4||5!=6 &&7>8+2  
//		              true     true      false
//		  boolean b = 7>4 || 5!=6 && 7>10
//		  boolean b = true || false
		//a.语法错误 b.true c 编译错误 d.运行错误 e.false
        
//        int a;
        //System.out.println(a);    //保存之后 编译器 eclipse 已经把当前文件编译了(相当于执行了javac命令)
         // 编译错误 即运行之前已经发现问题
		 
    }
}