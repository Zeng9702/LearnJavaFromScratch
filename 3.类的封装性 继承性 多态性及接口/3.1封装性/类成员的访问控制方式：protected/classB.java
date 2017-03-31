//2017.3.29
//javac -d . classB.java
package package2;
import package1.classA;

public class classB extends classA{
	public void methodB(){
		this.methodA();
	}
}