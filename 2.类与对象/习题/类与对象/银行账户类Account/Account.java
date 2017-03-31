//2017.3.31
//3.3.4-6
public class Account{   //银行账户类

	private String Id;   //账号
	private String owner;   //账户持有人姓名
	private double balance;   //余额
	
	public Account(){   //无参构造函数
		Id = null;
		owner = null;
		balance = 0.00;
	}
	
	public Account(String id,String owner,double amount){   //有参构造函数
		this.Id = id;
		this.owner = owner;
		this.balance = amount;
	}
	
	public void setID(String id){   //设置Id
		this.Id = id;
	}
	
	public void setOwner(String owner){   //设置owner
		this.owner = owner;
	}
	
	public double deposit(double amount)throws MyException{   //将金额存入账户
		if(this.Id == null){
			throw new MyException("账号未知！");
		}
		
		this.balance = this.balance + amount;
		return amount;
	}
	
	public double withdraw(double amount)throws MyException{   //从账户支取金额
		if(Id == null){
			throw new MyException("账号未知！");
		}
		else if(this.balance < amount){
			throw new MyException("余额不足！");
		}
		
		this.balance = this.balance - amount;
		return amount;
	}
	
	public void query(){   //打印id owner balance
		System.out.println("账号：" + this.Id);
		System.out.println("账户：" + this.owner);
		
		AccountUtil AU_balance = new AccountUtil();
		StringBuffer strB_balance = new StringBuffer();
		
		strB_balance = strB_balance.insert(0,balance);   //将double类型的balance转换为StringBuffer类型
		System.out.println("余额：" + AU_balance.toSeparateNumber(strB_balance));
	}
}

class MyException extends Exception{
	String message;
	public MyException(String ErrorMessagr){
		message = ErrorMessagr;
	}
	public String getMessage(){
		return message;
	}
}

