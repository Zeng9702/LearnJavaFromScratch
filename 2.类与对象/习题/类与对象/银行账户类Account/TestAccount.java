//2017.3.31
//3.3.4-6
public class TestAccount{
	public static void main(String[] args){
		Account a1 = new Account();
		a1.setID("a001");
		a1.setOwner("����");
		a1.query();   //��ӡid owner balance
		System.out.println();
		
		try{
			System.out.println("����" + a1.deposit(1000000.00));   //����100
			a1.query();
			System.out.println();
			
			System.out.println("ȡ��" + a1.withdraw(0.01));   //ȡ��101
			a1.query();
			System.out.println();
			  
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		
	}
}