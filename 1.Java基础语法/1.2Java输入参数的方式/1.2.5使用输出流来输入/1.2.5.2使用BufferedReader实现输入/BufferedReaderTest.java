/*
*2017.3.15
*ʹ��������������
*��������ʹ��BufferedReaderʵ������
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest{
	public static void main(String [] args)throws IOException{
		String s;
		int a;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������һ������");
		s = buf.readLine();
		a = Integer.parseInt(s);
		System.out.println("���������Ϊ��" + a);
	}
}