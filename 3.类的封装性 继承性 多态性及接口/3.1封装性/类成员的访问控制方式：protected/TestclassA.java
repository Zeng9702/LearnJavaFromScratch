//2017.3.29
//javac -d . TestclassA.java
//java package1.TestclassA

package package1;
import package2.classB;

public class TestclassA{
	public static void main(String[] args){
		classA a = new classA();
		a.methodA();
		
		classB b = new classB();
		b.methodB();
	}
}