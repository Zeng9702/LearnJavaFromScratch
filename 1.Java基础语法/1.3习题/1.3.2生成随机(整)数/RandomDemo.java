/*
2017.3.21
习题集2.3.4-5

//题目要求
先产生1个随机数n(要求0<n<10),
然后随机生成n个0~100的随机数，
输出这n个随机数的和。

//以随机整数为代表：
生成随机整数的方法：(数据类型)(最小值+Math.random()*(最大值-最小值+1))
例：(int) (1 + Math.random() * (9 - 1 + 1))   //生成随机0~10的整数
*/
public class RandomDemo{
	public static void main(String [] args){
		
		int n = (int) (1 + Math.random() * (9 - 1 + 1));   //生成随机整数n(0<n<10)
		final int N = n;
		System.out.print("生成" + n + "个随机整数：");
		
		int randomArr [] = new int [N];   //创建数组randomArr存储随机整数
		int sum = 0;
		
		for(int i = 0;i < n;i ++){   //产生n个0~100的随机整数并存入数组randoM中
			randomArr[i] = (int) (1 + Math.random() * (99 - 1 + 1));
		}
		
		for(int i = 0;i < randomArr.length;i ++){   //遍历数组randoM
			System.out.print(randomArr[i] + " ");
		}
		
		for(int i = 0;i < randomArr.length;i ++){   //计算n个随机整数总和并输出
			sum = sum + randomArr[i];
			if(i == (randomArr.length - 1)){
				System.out.println("总和:" + sum);
			}
		}
	}
}