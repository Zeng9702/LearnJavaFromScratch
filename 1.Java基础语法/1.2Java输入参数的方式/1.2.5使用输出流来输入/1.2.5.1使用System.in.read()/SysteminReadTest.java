/*
*2017.3.15
*使用输入流来输入
*方法一：使用System.in.read()
*/

import java.io.IOException;
public class SysteminReadTest{
	public static void main(String [] args)throws IOException{
		byte [] b = new byte[100];
		System.out.print("请输入：");
		int count = System.in.read(b);
		System.out.print("你输入的内容是：");
		for(int i = 0;i <= count - 1;i ++){
			System.out.print((char)b[i]);
		}
	}
}


