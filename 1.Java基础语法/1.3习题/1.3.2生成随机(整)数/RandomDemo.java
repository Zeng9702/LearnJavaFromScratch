/*
2017.3.21
ϰ�⼯2.3.4-5

//��ĿҪ��
�Ȳ���1�������n(Ҫ��0<n<10),
Ȼ���������n��0~100���������
�����n��������ĺ͡�

//���������Ϊ����
������������ķ�����(��������)(��Сֵ+Math.random()*(���ֵ-��Сֵ+1))
����(int) (1 + Math.random() * (9 - 1 + 1))   //�������0~10������
*/
public class RandomDemo{
	public static void main(String [] args){
		
		int n = (int) (1 + Math.random() * (9 - 1 + 1));   //�����������n(0<n<10)
		final int N = n;
		System.out.print("����" + n + "�����������");
		
		int randomArr [] = new int [N];   //��������randomArr�洢�������
		int sum = 0;
		
		for(int i = 0;i < n;i ++){   //����n��0~100�������������������randoM��
			randomArr[i] = (int) (1 + Math.random() * (99 - 1 + 1));
		}
		
		for(int i = 0;i < randomArr.length;i ++){   //��������randoM
			System.out.print(randomArr[i] + " ");
		}
		
		for(int i = 0;i < randomArr.length;i ++){   //����n����������ܺͲ����
			sum = sum + randomArr[i];
			if(i == (randomArr.length - 1)){
				System.out.println("�ܺ�:" + sum);
			}
		}
	}
}