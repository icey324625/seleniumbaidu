package day;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
	    System.out.print("����һ��0~99999 ֮���������:");
	    int a=s.nextInt();
	    if
	    (a/10000>=1&&a/10000<10){
	        System.out.println(a+"\t��5λ��");
	    }
	    else if(a/1000>=1){
	        System.out.println(a+"\t��4λ��");
	    }
	    else if(a/100>=1){
	        System.out.println(a+"\t��3λ��");
	    }
	    else if(a/10>=1){
	        System.out.println(a+"\t��2λ��");
	    }
	    else if(a/1>=1){
	        System.out.println(a+"\t��1λ��");
	    }
	}
}
