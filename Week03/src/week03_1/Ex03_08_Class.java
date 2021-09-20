package week03_1;

public class Ex03_08_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.color ="red";
		car1.speed = 0;
		
		
		Car car2 = new Car();
		car2.color = "blue";
		car1.speed = 0;
		
		System.out.println("car1 속도"+car1.getSpeed());
		car1.upSpeed(50);
		System.out.println("car1 속도"+car1.getSpeed());
		
		car2.downSpeed(20);
		System.out.println("car2의 색은"+car2.getColor()+" "+"속도는"+car2.getSpeed());

	}

}
