/*
*2017.3.15
*ʹ��������������
*����һ��ʹ��System.in.read()
*/

import java.io.IOException;
public class SysteminReadTest{
	public static void main(String [] args)throws IOException{
		byte [] b = new byte[100];
		System.out.print("�����룺");
		int count = System.in.read(b);
		System.out.print("������������ǣ�");
		for(int i = 0;i <= count - 1;i ++){
			System.out.print((char)b[i]);
		}
	}
}


