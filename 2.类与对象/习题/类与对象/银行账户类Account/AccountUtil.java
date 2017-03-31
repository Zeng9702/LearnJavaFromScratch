//2017.3.31
//3.3.4-6
//以一个十进制字符串为参数，返回用逗号隔开的数字字符串，
//分隔从右边开始，每三个数字用一个逗号隔开，
//若参数为小数，则分隔从小数点开始。
//例：若参数为 1234567.654321 ，则返回 1,234,567.654321 

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