import java.util.Scanner;

public class NarcissisticNumber{
	public static void main(String[] paramArrayOfString){
		
		Scanner startScan = new Scanner(System.in);
		Scanner endScan = new Scanner(System.in);
		int start; System.out.print("Start(>0):"); start = startScan.nextInt();
		int end; System.out.print("end(<" + Integer.MAX_VALUE + "):"); end = endScan.nextInt();
		System.out.println("NarcissisticNumber:");
		
		for(; start <= end; start ++){
			int zBackup = start;
			int amount = new NarcissisticNumber().Amount(start);
			int zTenPow = (int)Math.pow(10.0D, amount - 1);
			int [] nature = new int [amount];
			
			for(int i = amount - 1;i >= 0;i --){
				nature[i] = zBackup / zTenPow;
				zBackup = zBackup % zTenPow;
				zTenPow = zTenPow / 10;
			}
		
			int sum = 0;
			for (int i = amount - 1; i >= 0; i --){
				sum = sum + (int)Math.pow(nature[i], amount);
			}
		
			if (sum == start){
				System.out.println(sum);
			}
		
		}
	}
  
	int Amount(int number){
		int a = 1;
		int amount = 1;
		while((number / (a * 10) != 0)){
			a = a * 10;
			amount = amount + 1;
		}
		return amount;
	}
}