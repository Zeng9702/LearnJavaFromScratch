/*
*2017.3.15
*使用输入流来输入
*方法二：使用BufferedReader实现输入
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest{
	public static void main(String [] args)throws IOException{
		String s;
		int a;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入一个数：");
		s = buf.readLine();
		a = Integer.parseInt(s);
		System.out.println("您输入的数为：" + a);
	}
}