/*
*2017.3.21
*习题集P19 2.3.4-4
*用for语句实现ForDemo.java:
*从10-100能被2整除但不能被3整除的整数，
*要求每行按10个数(数与数之间有一个空格的间隔)的形式对其输出
*/
public class ForDemo{
	public static void main(String [] args){
		int sum = 0;
		for(int i = 10;i <= 100;i ++){
			if( (i % 2 == 0) && (i % 3 != 0) ){
				System.out.print(i + " ");
				sum = sum + 1;
				if(sum == 10){
					System.out.println( );
					sum = 0;
				}
			}
		}
	}
}