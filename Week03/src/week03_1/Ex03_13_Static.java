package week03_1;

public class Ex03_13_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("red",0); // 생성자로 변수값 바로 수정
		Car car2 = new Car("blue",0); 
		Car car3 = new Car("green",0); 
		
		// 정적 변수,정적 메소드로 클래스의 고유 값 출력
		System.out.println("생산된 차의 대수(정적 필드)"+Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드)"+Car.currentCarCount());
		System.out.println("차의 최고 속도"+Car.MAXSPEED);
		
		System.out.println("PI값 "+Math.PI);
		System.out.println("3의 5제곱"+Math.pow(3,5));
	}

}
