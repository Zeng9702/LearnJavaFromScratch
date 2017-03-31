//2017.3.29
//3.3.4-8

import java.util.Scanner;
public class TestTriangle{
	public static void main(String[] args){
		Scanner sideAScan = new Scanner(System.in);
		Scanner sideBScan = new Scanner(System.in);
		Scanner sideCScan = new Scanner(System.in);
		
		System.out.print("sideA : ");
		double sideA = sideAScan.nextInt();
		System.out.print("sideB : ");
		double sideB = sideBScan.nextInt();
		System.out.print("sideC : ");
		double sideC = sideCScan.nextInt();
		
		Triangle triangle = new Triangle(sideA,sideB,sideC);
		triangle.showSide();
		System.out.println("Area = " + triangle.getArea());
	}
}