import java.util.Scanner;

public class TestRectangle{
	public static void main(String[] args){
		Scanner lengthScan = new Scanner(System.in);
		Scanner heightScan = new Scanner(System.in);
		
		int length;
		System.out.print("Length:");
		length = lengthScan.nextInt();
		
		int height;
		System.out.print("Height:");
		height = heightScan.nextInt();
		
		Rectangle rectangle = new Rectangle(length,height);
		rectangle.draw();
		System.out.println("Area = " + rectangle.getArea());
		System.out.println("Perimeter = " + rectangle.getPerimeter());
	}
}