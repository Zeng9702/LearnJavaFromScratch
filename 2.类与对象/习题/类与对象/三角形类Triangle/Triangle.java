//2017.3.29
//3.3.4-8

public class Triangle{
	private double sideA,sideB,sideC;   //���߳�
	
	public Triangle(double sideA,double sideB,double sideC){   //���캯��
		if((sideA > 0)&&(sideB > 0)&&(sideC > 0)){
			if((sideA + sideB > sideC)&&(sideA + sideC > sideB)&&(sideB + sideC > sideA)){
				this.sideA = sideA;
				this.sideB = sideB;
				this.sideC = sideC;
			}
			else{
				double side;
				if(sideA < sideB){
					side = sideA;
				}
				else{
					side = sideB;
				}
				if(sideC < side){
					side = sideC;
				}
				
				this.sideA = this.sideB = this.sideC = side;
			}
		}
		
		else{
			System.out.println("�����εı߳�ӦΪ��ʵ����");
		}
	}
	
	public void showSide(){   //������߳�
		System.out.println("Sides: " + sideA + " , " + sideB + " , " + sideC);
	}
	
	public double getArea(){   //�����������
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));   //Heron's formula
	}
}