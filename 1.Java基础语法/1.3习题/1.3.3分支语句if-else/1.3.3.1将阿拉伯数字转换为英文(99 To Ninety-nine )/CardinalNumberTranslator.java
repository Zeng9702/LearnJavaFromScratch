//2017.3.23
//将阿拉伯数字转换为英文(1~999,999,999)
//已知缺陷：100000001 one hundred million one，正确应为：one hundred million and one，缺少and

import java.util.Scanner;

public class CardinalNumberTranslator{
	public static void main(String[] args){
		
		int positiveInt,numberMillion,numberThousand;
		
		while(true){
			System.out.print("enter a positive Int(1,000,000,000>Int>0): ");
			Scanner positiveIntScan = new Scanner(System.in);
			positiveInt = positiveIntScan.nextInt();
			System.out.print(positiveInt + ": ");
			
			while(positiveInt > 999){
				if(positiveInt >= 1000000&&positiveInt < 1000000000){
					numberMillion = positiveInt / 1000000;
					positiveInt = positiveInt % 1000000;
				
					new CardinalNumberTranslator().zero2Nine_Hundred_And_Ninety_Nine(numberMillion);
					System.out.print("million" + " ");
				}
		
				else if(positiveInt >= 1000&&positiveInt < 1000000){
					numberThousand = positiveInt / 1000;
					positiveInt = positiveInt % 1000;
				
					new CardinalNumberTranslator().zero2Nine_Hundred_And_Ninety_Nine(numberThousand);
					System.out.print("thousand" + " ");
				}
			
				else{
					System.out.print("Error！");
				}
			}
				
			new CardinalNumberTranslator().zero2Nine_Hundred_And_Ninety_Nine(positiveInt);
			
			System.out.println();
			System.out.println();
		}
	}
	
	void zero2Nine_Hundred_And_Ninety_Nine(int positiveInt){   //输出0~999
		if(positiveInt >= 0&&positiveInt <= 99){   //0~99
			new CardinalNumberTranslator().zero2Ninety_Nine(positiveInt);
		}
		
		else if(positiveInt >= 100&&positiveInt <= 999){   //100~999
			int OH2NHANN_quotient = positiveInt / 100;
			int OH2NHANN_remainder = positiveInt % 100;
			
			if(OH2NHANN_remainder == 0){
				new CardinalNumberTranslator().zero2Ninety_Nine(OH2NHANN_quotient);
				System.out.print("hundred" + " ");
			}
			
			else{
				new CardinalNumberTranslator().zero2Ninety_Nine(OH2NHANN_quotient);
				System.out.print("hundred and" + " ");
				new CardinalNumberTranslator().zero2Ninety_Nine(OH2NHANN_remainder);
			}
			
		}
			
		else{
			System.out.println("zero2Nine_Hundred_And_Ninety_Nine(int positiveInt) Error!");
		}
	}
	
	void zero2Ninety_Nine(int positiveInt){   //输出1~99	
		String[] one2Nine = new String[]{"one","two","three","four","five","six","seven","eight","nine"};   //1~9
		String[] eleven2Nineteen = new String[]{"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};   //11~19
		String[] ten2Ninety = new String[]{"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};   //10~90
		
		if(positiveInt != 0){   //1~99
			if(positiveInt >= 1 && positiveInt <= 9){   //1~9
				System.out.print(one2Nine[positiveInt - 1] + " ");
			}
			
			else if(positiveInt >= 11 && positiveInt <= 19){   //11~19
				System.out.print(eleven2Nineteen[positiveInt % 10 - 1] + " ");
			}
		
			else if((positiveInt >= 10 && positiveInt <= 90)&&positiveInt % 10 == 0){   //10,20~90
				System.out.print(ten2Ninety[positiveInt / 10 - 1] + " ");
			}
			
			else{   //21,29,31~99
				int o2NN_quotient = positiveInt / 10;
				int o2NN_remainder = positiveInt % 10;
				System.out.print(ten2Ninety[o2NN_quotient - 1] + "-" + one2Nine[o2NN_remainder - 1] + " ");
			}
		}
		
		else if(positiveInt == 0){
			System.out.print("");
		}
		
		else{   //异常情况
			System.out.println("zero2Ninety_Nine(int positiveInt) Error!");
		}
		
	}
}