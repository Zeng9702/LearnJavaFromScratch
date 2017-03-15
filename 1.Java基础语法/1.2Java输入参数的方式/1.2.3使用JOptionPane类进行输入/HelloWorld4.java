/*
*2017.3.15
*使用JOptionPane类进行输入
*/
import javax.swing.JOptionPane;   //导入JOptionpane类

public class HelloWorld4{
	public static void main(String args []){
		String s = JOptionPane.showInputDialog("请输入：(例如：HelloWorld！)");
		System.out.println("您输入的是：" + s);
	}
}