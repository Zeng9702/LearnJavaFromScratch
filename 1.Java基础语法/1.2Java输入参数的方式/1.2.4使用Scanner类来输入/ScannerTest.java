/*
*2017.3.15
*使用Scanner类来输入
*/
import java.util.Scanner;   //导入Scanner类

public class ScannerTest{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.print("请输入一个数：");
		a = scanner.nextInt();
		System.out.println("您输入的数是：" + a);
	}
}