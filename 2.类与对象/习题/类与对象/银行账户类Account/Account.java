//2017.3.31
//3.3.4-6
public class Account{   //�����˻���

	private String Id;   //�˺�
	private String owner;   //�˻�����������
	private double balance;   //���
	
	public Account(){   //�޲ι��캯��
		Id = null;
		owner = null;
		balance = 0.00;
	}
	
	public Account(String id,String owner,double amount){   //�вι��캯��
		this.Id = id;
		this.owner = owner;
		this.balance = amount;
	}
	
	public void setID(String id){   //����Id
		this.Id = id;
	}
	
	public void setOwner(String owner){   //����owner
		this.owner = owner;
	}
	
	public double deposit(double amount)throws MyException{   //���������˻�
		if(this.Id == null){
			throw new MyException("�˺�δ֪��");
		}
		
		this.balance = this.balance + amount;
		return amount;
	}
	
	public double withdraw(double amount)throws MyException{   //���˻�֧ȡ���
		if(Id == null){
			throw new MyException("�˺�δ֪��");
		}
		else if(this.balance < amount){
			throw new MyException("���㣡");
		}
		
		this.balance = this.balance - amount;
		return amount;
	}
	
	public void query(){   //��ӡid owner balance
		System.out.println("�˺ţ�" + this.Id);
		System.out.println("�˻���" + this.owner);
		
		AccountUtil AU_balance = new AccountUtil();
		StringBuffer strB_balance = new StringBuffer();
		
		strB_balance = strB_balance.insert(0,balance);   //��double���͵�balanceת��ΪStringBuffer����
		System.out.println("��" + AU_balance.toSeparateNumber(strB_balance));
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

