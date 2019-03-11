package day;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
        int i=0;
        while(a<=200){
            if(a%3==0){
                i=i+a;
            }
            a++;
        }
        System.out.println("1~200之间所有3的倍数之和为:"+i);
	}
}
