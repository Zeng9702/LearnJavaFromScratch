/*
*2017.3.15
*ʹ��Scanner��������
*/
import java.util.Scanner;   //����Scanner��

public class ScannerTest{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.print("������һ������");
		a = scanner.nextInt();
		System.out.println("����������ǣ�" + a);
	}
}