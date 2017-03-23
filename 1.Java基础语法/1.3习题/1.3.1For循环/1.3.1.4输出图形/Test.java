public class Test{
	public static void main(String args[]){
		boolean y = true;
		while(y){
			int Number = 1;
				for(int i = 1;i <= 9;i ++){
					for(int space = 9 - i;space >= 0;space --){
					System.out.print(" ");
				}
				for(int number = Number;number > 0;number --){
					System.out.print(i);
				}
			Number = Number + 2;
			System.out.println();
			}
		
			int Number2 = 15;
			for(int i = 72;i >= 65;i --){
				for(int space = 73 - i;space >= 0;space --){
					System.out.print(" ");
				}
				for(int number = Number2;number > 0;number --){
					System.out.print((char)i);
				}
			Number2 = Number2 - 2;
			System.out.println();
		}
		}
	}
}