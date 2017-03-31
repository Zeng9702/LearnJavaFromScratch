//2017.3.31
//3.3.4-6
public class TestAccount{
	public static void main(String[] args){
		Account a1 = new Account();
		a1.setID("a001");
		a1.setOwner("张三");
		a1.query();   //打印id owner balance
		System.out.println();
		
		try{
			System.out.println("存入" + a1.deposit(1000000.00));   //存入100
			a1.query();
			System.out.println();
			
			System.out.println("取出" + a1.withdraw(0.01));   //取出101
			a1.query();
			System.out.println();
			  
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		
	}
}