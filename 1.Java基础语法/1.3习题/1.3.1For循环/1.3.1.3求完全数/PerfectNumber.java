//2017.3.22
//求一定区域内的完全数
import java.util.Scanner;

public class PerfectNumber{
	public static void main(String [] args){
		Scanner startScan = new Scanner(System.in);
		Scanner endScan = new Scanner(System.in);
		System.out.println("求Start~End区域内的完全数(请输入正整数)");
		int start; System.out.print("Start(>0):"); start = startScan.nextInt();
		int end; System.out.print("end(<" + Integer.MAX_VALUE + "):"); end = endScan.nextInt();
		
		for(;start <= end;start ++){
			int sumOfFactors = 0;
			int [] arr = (new PerfectNumber().Factor(start));
			for(int i = 0;i < arr.length;i ++){
				sumOfFactors = sumOfFactors + arr[i];
			}
			if(sumOfFactors == start){
				System.out.print(start + " ");
			}
			
		}
	}
	
	int[] Factor(int PositiveInteger){   //求正整数的因子
		int [] a = new int [PositiveInteger / 2];
		int i = 1;
		for(int j = 0;i <= PositiveInteger / 2;i ++){
			if(PositiveInteger % i == 0){
				a[j] = i;
				j = j + 1;
			}
		}
		return a;
	}
	
}