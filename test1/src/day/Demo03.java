package day;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("输入一个整数:");
		int a=s.nextInt();
		int b=0;
		while(a>0) {
			int i=a%10;
			 b=b*10+i;	
			a=a/10;	  	
		}
		System.out.println("相反顺序输出:"+b);
	}
}
