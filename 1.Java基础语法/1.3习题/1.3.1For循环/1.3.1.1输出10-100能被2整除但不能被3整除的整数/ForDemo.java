/*
*2017.3.21
*ϰ�⼯P19 2.3.4-4
*��for���ʵ��ForDemo.java:
*��10-100�ܱ�2���������ܱ�3������������
*Ҫ��ÿ�а�10����(������֮����һ���ո�ļ��)����ʽ�������
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