//2017.3.29
//3.3.4-1

public class TestSuansu{
	public static void main(String[] args){
		Suansu s = new Suansu(10,5);
		System.out.println("a + b = " + s.AddAB());
		System.out.println("a - b = " + s.SubAB());
		System.out.println("a * b = " + s.MultiAB());
		System.out.println("a / b = " + s.DivAB());
	}
}