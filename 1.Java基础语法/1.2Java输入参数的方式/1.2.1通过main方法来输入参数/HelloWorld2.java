/*
*2017.3.15
*通过main方法来输入参数
*javac HelloWorld2 你好 世界 ！
*/
public class HelloWorld2{
	public static void main(String args[]){
		for(int i = 0;i < args.length;i++){
			System.out.print(args[i]);
		}
		
	}
}