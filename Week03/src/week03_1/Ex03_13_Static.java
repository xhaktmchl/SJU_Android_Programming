package week03_1;

public class Ex03_13_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("red",0); // �����ڷ� ������ �ٷ� ����
		Car car2 = new Car("blue",0); 
		Car car3 = new Car("green",0); 
		
		// ���� ����,���� �޼ҵ�� Ŭ������ ���� �� ���
		System.out.println("����� ���� ���(���� �ʵ�)"+Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�)"+Car.currentCarCount());
		System.out.println("���� �ְ� �ӵ�"+Car.MAXSPEED);
		
		System.out.println("PI�� "+Math.PI);
		System.out.println("3�� 5����"+Math.pow(3,5));
	}

}
