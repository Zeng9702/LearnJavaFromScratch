//2017.3.31
//3.3.4-6
//��һ��ʮ�����ַ���Ϊ�����������ö��Ÿ����������ַ�����
//�ָ����ұ߿�ʼ��ÿ����������һ�����Ÿ�����
//������ΪС������ָ���С���㿪ʼ��
//����������Ϊ 1234567.654321 ���򷵻� 1,234,567.654321 

public class AccountUtil{
	public StringBuffer toSeparateNumber(StringBuffer str){
		int i;
		if(str.indexOf(".") != -1){
			i = str.indexOf(".") - 3;
		}
		else{
			i = str.length() - 3;
		}
		
		for(;i > 0;i = i - 3){
			str.insert(i,",");
		}
		return str;
	}
}