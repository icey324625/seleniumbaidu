package day;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
	    System.out.print("年:");	    
	    int year=s.nextInt();
	    System.out.print("月:");
	    int month=s.nextInt();
	    System.out.print("日:");
	    int day=s.nextInt();
	    int days=0;
	    switch(month){
	        case 12:days+=30;
	        case 11:days+=31;
	        case 10:days+=30;
	        case 9:days+=31;
	        case 8:days+=31;
	        case 7:days+=30;
	        case 6:days+=31;
	        case 5:days+=30;
	        case 4:days+=31;	       
	        case 3:
	        	if((year%4==0&&year%100!=0)||(year%400==0)){
	                days+=29;
	                }
	            else{
	                days+=28;
	                }	        	
	        case 2:days+=31;	        	
	        case 1:days+=day;
	    }
	        System.out.print("该天是:"+year+"年的第" + days + "天");
	}
}
