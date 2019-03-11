package day;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=4,c=22,d=83,t=0;    
		if(a<b){ 
			t=a;    a=b;    b=t;   } 
		if(a<c){ 
			t=a;    a=c;    c=t;   }   
		if(a<d){ 
			t=a;    a=d;    d=t;   }   
		if(b<c){ 
			t=b;    b=c;    c=t;   }  
		if(b<d){ 
			t=b;     b=d;     d=t; }   
		if(c<d){ 
			t=c;     c=d;     d=t; } {
				System.out.println(" 4 个整数从大到小的顺序排列为:"+a+","+b+","+c+","+d);
			}
	}

}
