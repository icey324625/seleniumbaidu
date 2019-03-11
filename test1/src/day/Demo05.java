package day;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
	    System.out.print("输入一个0~99999 之间的任意数:");
	    int a=s.nextInt();
	    if
	    (a/10000>=1&&a/10000<10){
	        System.out.println(a+"\t是5位数");
	    }
	    else if(a/1000>=1){
	        System.out.println(a+"\t是4位数");
	    }
	    else if(a/100>=1){
	        System.out.println(a+"\t是3位数");
	    }
	    else if(a/10>=1){
	        System.out.println(a+"\t是2位数");
	    }
	    else if(a/1>=1){
	        System.out.println(a+"\t是1位数");
	    }
	}
}
