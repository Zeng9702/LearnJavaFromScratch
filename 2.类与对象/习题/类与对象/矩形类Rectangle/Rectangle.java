//2017.3.29
//3.3.4-1

class Rectangle{
	private int length,height;
	
	Rectangle(int length,int height){
		this.length = length;
		this.height = height;
	}
	
	int getArea(){
		return length * height;
	}
	
	int getPerimeter(){
		return (length + height) * 2;
	}
	
	void draw(){
		System.out.println("Rectangle£º");
		for(int h = 0;h < height;h ++){
			System.out.print("	  ");
			for(int l = 0;l < length;l ++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
