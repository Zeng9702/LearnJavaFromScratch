//2017.3.29
//protected:
//1.同一个包内的所有类的所以方法都能访问使用protected修饰符成员
//2.如果不在同一个包内的类的方法要访问成员，则该类必须是该成员所在类的子类

//classA与TestclassA在package1中
//classB在package2中，classB是classA的子类

//javac -d . classA.java

package package1;

public class classA{
	protected void methodA(){
		System.out.println("methodA()");
	}
}